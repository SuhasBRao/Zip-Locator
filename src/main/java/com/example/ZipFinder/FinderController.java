package com.example.ZipFinder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Controller
public class FinderController {

    private String apiURL;

    @GetMapping("/")
    public String addZip(Model model){
        model.addAttribute("zipInput", new ZipCodeInput());
        return "addZip";
    }

    // Below bean helps us to make http request to API
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

    @PostMapping("/")
    public String showResult(@ModelAttribute ZipCodeInput zipcode, Model model, RestTemplate restTemplate){
        
        model.addAttribute("zipInput", zipcode);
        apiURL = zipcode.getLink();

        System.out.println(apiURL);
        
        // The info retrived from api call is list of Json array. So we are storing it as a resultdataArray
        ResultData  resultdata[] = restTemplate.getForObject(apiURL, ResultData[].class);
        System.out.println(resultdata[0]);

        if(resultdata[0].getStatus() == "Error"){
            return "error";
        }
    
        // save it as a model object with name ZipData this is used in html to show the output
        model.addAttribute("ZipData", resultdata[0]);

        return "showResult";
    }

}

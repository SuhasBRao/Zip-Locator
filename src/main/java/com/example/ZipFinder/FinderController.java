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

    @GetMapping("/addZip")
    public String addZip(Model model){
        model.addAttribute("addZip", new ZipCode());
        return "addZip";
    }

    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

    @PostMapping("/addZip")
    public String showResult(@ModelAttribute ZipCode zipcode, Model model, RestTemplate restTemplate){
        
        model.addAttribute("addZip", zipcode);
        apiURL = zipcode.getLink();

        System.out.println(apiURL);
        
        ResultData resultdata = restTemplate.getForObject(
					apiURL, ResultData.class);
        model.addAttribute("ZipData", resultdata);

        return "showResult";
    }

}

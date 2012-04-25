package ys276.core.web.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class Web {
	
	
	private final Log log = LogFactory.getLog(Web.class);

    @RequestMapping("/index.html")
    public String index() {
        return "index";
    }


}

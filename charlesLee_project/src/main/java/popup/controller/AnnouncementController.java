package popup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import popup.service.AnnouncementService;

@Controller
public class AnnouncementController {
	
	@Autowired
	AnnouncementService announcementService;
}

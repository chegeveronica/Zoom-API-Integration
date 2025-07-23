package com.veronica.zoom;

import com.fasterxml.jackson.databind.JsonNode;
import com.veronica.zoom.service.ZoomMeetingService;
import com.veronica.zoom.service.ZoomTokenService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootConfiguration
//public class ZoomApplication {
//    public static void main(String[] args)  {
//        SpringApplication.run(ZoomApplication.class, args);

//        String clientId = "kpYOfQxSrKAHl8DbjSJIA";
//        String clientSecret = "36rlPAGY12ofWUpBlzyLzKU2NM49LtAi";
////        String accountId = "ZOT13hiPRli-8zaidY0fsA";
//        String redirectUri = "https://oauth.pstmn.io/v1/callback";
//        String authorizationCode = "1Fzal2PtiJOTa4AreSHQemv8X1QXTUhRQ";
//
//        ZoomTokenService tokenService = new ZoomTokenService();
//
//        // Step 1: Exchange authorization code for access token
//        JsonNode accessToken = tokenService.exchangeAuthCodeForAccessToken(
//                authorizationCode,
//                redirectUri,
//                clientId,
//                clientSecret
//        );
//
////        ZoomTokenService tokenService = new ZoomTokenService();
////        String token = tokenService.getAccessToken(clientId, clientSecret, accountId);
//
//        ZoomMeetingService meetingService = new ZoomMeetingService();
//        meetingService.createMeeting(accessToken.get("access_token").asText(),
//                "Kenya Tech Conference",
//                "2025-08-01T10:30:00Z",
//                120,
//                "Africa/Nairobi");
//
//    }
//}

@SpringBootApplication
public class ZoomApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ZoomApplication.class);
//        app.setWebApplicationType(WebApplicationType.SERVLET); // Force servlet mode
        app.run(args);
    }
}


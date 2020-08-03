package com.cos.securityex01.config.auth.oauth;

import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class PrincipalOauth2UserService extends DefaultOAuth2UserService {

	// userRequset 는 code를 받아서 accessToken 을 응답 받은 객체
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2User oAuth2User = super.loadUser(userRequest); // google의 회원 프로필
		// 1. PrincipalDetails에 oAuth2User 정보를 집어 넣어 준다.
		// 2. PrincipalDetails를 리턴한다.
		System.out.println("oAuth2User : " + oAuth2User); // 토큰을 통해 응답받은 회원정보
		System.out.println("oAuth2User : " + userRequest.getAccessToken().getTokenValue());  
		System.out.println("oAuth2User : " + userRequest.getAccessToken());  
		try {
			
		} catch (Exception e) {

		}
		return super.loadUser(userRequest);
	}
	
	private OAuth2User processOAuth2User(OAuth2UserRequest userRequest, OAuth2User auth2User) { // principalDetails를 만들어서 넘기기
		
		// 일반적으로는 로그인할 때 유저 정보 User
		// 1. OAuth2로 로그인할 때 유저 정보 attributes(콤포지션)
		
		// 2. DB에 있는 사용자인지 확인
		
		// 있을 시 : 사용자의 유저정보 update
		
		// 없을 시 : 회원가입 insert
		
		// return PrincipalDetails() 
		
		return null;
	}
}
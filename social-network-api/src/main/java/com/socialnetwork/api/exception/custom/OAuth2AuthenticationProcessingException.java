package src.main.java.com.socialnetwork.api.exception.custom;

import org.springframework.security.core.AuthenticationException;

public class OAuth2AuthenticationProcessingException extends AuthenticationException {
  public OAuth2AuthenticationProcessingException(String message) {
    super(message);
  }
}

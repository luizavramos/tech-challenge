package br.com.techchallenge.fiap.techChallenge.mappers;

import br.com.techchallenge.fiap.techChallenge.entities.User;

public class UserMapper {
    public static UserPublicData toAPI(User user) {
        return new UserPublicData(user);
    }
}

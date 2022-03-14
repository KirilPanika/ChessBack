package com.chess.chessbackend.payload.request;

import javax.validation.constraints.NotNull;

public class JoinGameRequest
{
    @NotNull
    private Long gameId;

    @NotNull
    private Long playerId;


    public Long getGameId()
    {
        return gameId;
    }

    public void setGameId(Long gameId)
    {
        this.gameId = gameId;
    }

    public Long getPlayerId()
    {
        return playerId;
    }

    public void setPlayerId(Long playerId)
    {
        this.playerId = playerId;
    }
}

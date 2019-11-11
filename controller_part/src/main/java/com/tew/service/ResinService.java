package com.tew.service;

import com.tew.dto.ResDTO;

public interface ResinService {
    public boolean GetResIn(ResDTO resDTO);
    public boolean UpdateRes(ResDTO resDTO);
    public ResDTO ShowRes(String IcNumber);
    public boolean DeleteRes(String id);
}

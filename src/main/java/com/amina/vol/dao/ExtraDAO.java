package com.amina.vol.dao;

import com.amina.vol.entites.Extra;

import java.util.List;
import java.util.Optional;

public interface ExtraDAO {
    public Optional<Extra>addExtra(Extra extra);
    public Optional<Extra>updateExtra(Extra extra);
    public Optional<Extra>deleteExtra(int extraId);
    public  Optional<List<Extra>> findAllExtra();
    public Optional<Extra> findExtraById(int extraId);

}

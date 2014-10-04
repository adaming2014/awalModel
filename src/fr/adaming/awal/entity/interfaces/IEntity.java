/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.entity.interfaces;

import java.io.Serializable;

/**
 *
 * @author INTI0221
 * @param <T>   Id type
 */
public interface IEntity<T> extends Serializable {
    T getId();
}

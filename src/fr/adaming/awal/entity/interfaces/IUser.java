/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.entity.interfaces;

import fr.adaming.awal.entity.User;

/**
 *
 * @author INTI0221
 */
public interface IUser<T> extends IEntity<T> {
   public User getUser();
}

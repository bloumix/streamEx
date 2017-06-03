/*
*
*
------------------------------------------------------------------------------
* com.xavier.util
*
------------------------------------------------------------------------------
* COPYRIGHT (C) 2017 Ingenico
* ALL RIGHTS RESERVED
*
------------------------------------------------------------------------------
*  Copyright in the whole and every part of this software program belongs to
*  Ingenico.  It may not be used, sold, licensed, transferred, copied
*  or reproduced in whole or in part in any manner or form other than in
*  accordance with and subject to the terms of a licence from Ingenico
*  or with the prior written consent of Ingenico or as permitted by
*  applicable law.
*  This software program contains confidential and proprietary information and
*  must not be disclosed, in whole or in part, to any person or organisation
*  without the prior written consent of Ingenico.
*  Any copies or reproductions of this software program (in whole or in part)
*  made by any method must also include a copy of this legend.
*
------------------------------------------------------------------------------
*/
package com.xavier.util;

import com.xavier.Email;
import com.xavier.Person;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;

/**
 * Created by xbloumine on 03/06/2017.
 */
public class PersonUtil {

    public static Integer sumOfAges(List<Person> personList) {
        //sum
        throw new NotImplementedException();
    }

    public static List<Person> filterListByName(String name, List<Person> personList) {
        //filter
        throw new NotImplementedException();
    }

    public static Map<Integer, List<Person>> mapOfPersonPerAge(List<Person> personList) {
        //collect
        throw new NotImplementedException();
    }

    public static Integer nbPersonOf7y(List<Person> personList) {
        //count
        throw new NotImplementedException();
    }

    public static boolean listContainOnly7yPersons(List<Person> personList) {
        //allMatch
        throw new NotImplementedException();
    }

    public static List<Email> getEmailsFromPersonList(List<Person> personList) {
        //flatmap
        throw new NotImplementedException();
    }

    public static Map<Integer, List<Email>> getEmailsbyAge(List<Person> personList) {
        throw new NotImplementedException();
    }
}

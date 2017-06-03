/*
*
*
------------------------------------------------------------------------------
* com.xavier
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
package com.xavier;

import com.xavier.util.PersonUtil;
import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by xbloumine on 03/06/2017.
 */
public class PersonUtilTest {

    private final List<Person> personList = Arrays.asList(
            createPerson("Xavier", 7, Collections.singletonList(new Email("xavier@yo.com")))
            , createPerson("Raphael", 6, Arrays.asList(new Email("raphi@yo.com"), new Email("otherEmailRaphi@yo.com")))
            , createPerson("Nico", 1, Collections.singletonList(new Email("nico@yo.com")))
            , createPerson("Cedric", 10, Collections.singletonList(new Email("cedr@yo.com")))
            , createPerson("Tchiou", 7, Collections.singletonList(new Email("tchioutchiou@yo.com")))
            , createPerson("Ihmen", 7, Collections.singletonList(new Email("imhen@yo.com")))
    );

    @Test
    public void should_return_42_when_persons_has_sum_of_42_years() {
        assertThat(PersonUtil.sumOfAges(personList))
                .isEqualTo(42);
    }

    @Test
    public void should_return_list_without_xavier_when_list_with_xavier_is_in_input() {
        assertThat(PersonUtil.filterListByName("Xavier", personList))
            .doesNotContain(personList.get(0));
    }

    @Test
    public void should_return_map_of_persons_by_age_with_3_persons_with_7y_when_personList_is_passed() {
        List<Person> personListOf7 = Arrays.asList(
                this.personList.get(0)
                ,this.personList.get(4)
                , this.personList.get(5)
        );
        Map.Entry<Integer, List<Person>> personWhoHas7y = new HashMap.SimpleEntry<>(7, personListOf7);

        assertThat(PersonUtil.mapOfPersonPerAge(this.personList))
                .contains(personWhoHas7y)
        ;
    }

    @Test
    public void should_return_3_when_count_of_persons_of_7y() {
        assertThat(PersonUtil.nbPersonOf7y(personList))
                .isEqualTo(3);
    }

    @Test
    public void should_return_false_when_personList_does_not_contain_only_age_of_7() {
        assertThat(PersonUtil.listContainOnly7yPersons(personList))
                .isEqualTo(false);
    }

    @Test
    public void should_return_list_of_7_emails_when_personList_has_emails() {
        assertThat(PersonUtil.getEmailsFromPersonList(personList))
                .hasSize(7)
                .contains(personList.get(1).getEmails().get(0), personList.get(1).getEmails().get(1));
    }

    @Test
    public void should_return_map_of_emails_by_age() {

        AbstractMap.SimpleEntry emailsBy6y = new HashMap.SimpleEntry(7,
                Arrays.asList(personList.get(1).getEmails().get(0) ,personList.get(1).getEmails().get(1))
        );
        assertThat(PersonUtil.getEmailsbyAge(personList))
                .containsKeys(7)
                .contains(emailsBy6y);
    }

    private Stream<Person> createPersonStream(List<Person> personList) {
        Stream.Builder<Person> builder = Stream.<Person>builder();

        personList.forEach(builder::add);
        return builder.build();
    }


    private Person createPerson(String name, Integer age, List<Email> emails) {
        return Person.builder()
                .name(name)
                .age(age)
                .emails(emails)
                .build();
    }

}
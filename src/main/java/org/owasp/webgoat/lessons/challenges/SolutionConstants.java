/*
 * This file is part of WebGoat, an Open Web Application Security Project utility. For details, please see http://www.owasp.org/
 *
 * Copyright (c) 2002 - 2019 Bruce Mayhew
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * Getting Source ==============
 *
 * Source for this application is maintained at https://github.com/adracea/WebGoat, a repository for free software projects.
 */

package org.owasp.webgoat.lessons.challenges;

/**
 * Interface with constants so we can easily change the flags
 *
 * @author nbaars
 * @since 3/23/17.
 */
public interface SolutionConstants {

    //TODO should be random generated when starting the server
    String PASSWORD = "!!webgoat_admin_1234!!";
    String PASSWORD_TOM = "thisisasecretfortomonly";
    String ADMIN_PASSWORD_LINK = "375afe1104f4a487a73823c50a9292a2";
}

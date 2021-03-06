/*
 * Data Hub Service (DHuS) - For Space data distribution.
 * Copyright (C) 2013,2014,2015 GAEL Systems
 *
 * This file is part of DHuS software sources.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package fr.gael.dhus.datastore;

import java.net.URL;
import java.util.List;

import fr.gael.dhus.database.object.Collection;
import fr.gael.dhus.database.object.User;
import fr.gael.dhus.datastore.scanner.FileScannerWrapper;
import fr.gael.dhus.datastore.scanner.Scanner;

/**
 * DataStore class provides the methods used to access the stores, download data
 * and upload data. 
 * It manages all the configured archives.
 *
 */
public interface DataStore
{
   public void addProduct (URL path, User owner,
      List<Collection>collections, String origin, Scanner scanner,
      FileScannerWrapper wrapper);
   
   public void removeProduct (Long p_id);
}

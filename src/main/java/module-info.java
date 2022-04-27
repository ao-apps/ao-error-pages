/*
 * ao-error-pages - A set of simple default servlet error pages to prevent accidental information disclosure.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of ao-error-pages.
 *
 * ao-error-pages is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ao-error-pages is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with ao-error-pages.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.aoapps.error.pages {
  // Direct
  requires com.aoapps.taglib; // <groupId>com.aoapps</groupId><artifactId>ao-taglib</artifactId>
  requires com.aoapps.web.resources.taglib; // <groupId>com.aoapps</groupId><artifactId>ao-web-resources-taglib</artifactId>
  requires taglibs.standard.spec; // <groupId>org.apache.taglibs</groupId><artifactId>taglibs-standard-spec</artifactId>
} // TODO: Avoiding rewrite-maven-plugin-4.22.2 truncation

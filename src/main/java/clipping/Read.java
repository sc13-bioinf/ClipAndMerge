/*
 * Copyright (c) 2016. ClipAndMerge Günter Jäger
 * This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package clipping;

public class Read {
	public String name;
	public String sequence;
	public String empty;
	public String quality;
	
	public Read(String name, String sequence, String empty, String quality) {
		this.name = name;
		this.sequence = sequence;
		this.empty = empty;
		this.quality = quality;
	}

	public Read(String[] lines) {
		this.name = lines[0];
		this.sequence = lines[1];
		this.empty = lines[2];
		this.quality = lines[3];
	}
}

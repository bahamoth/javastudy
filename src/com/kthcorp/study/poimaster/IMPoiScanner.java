package com.kthcorp.study.poimaster;

import java.util.List;

public interface IMPoiScanner {
	
	public List<MPoi> read(Object input);
	void write(List<MPoi> pois, Object output);
	
}

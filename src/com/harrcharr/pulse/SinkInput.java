package com.harrcharr.pulse;

public class SinkInput extends OwnedStreamNode {
	public SinkInput(PulseContext pulse, long ptr) {
		super(pulse, ptr);
	}
	
	public void update(long ptr) {
		JNIPopulateStruct(ptr);
	}

	private final native void JNIPopulateStruct(long pSinkInputInfo);
}
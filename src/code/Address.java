package code;

public class Address implements Comparable<Address>{
	private String fileName; //file name
	private int blockOffset; //block offset in file
	private int byteOffset;  //byte offset in block

	public Address() {
		//do nothing
	}

	public Address(String fileName,int blockOffset,int byteOffset) {
		this.fileName = fileName;
		this.blockOffset = blockOffset;
		this.byteOffset = byteOffset;
	}

	@Override
	public int compareTo(Address address) {
		if(this.fileName.compareTo(address.fileName) == 0) { //first compare file name
			if (this.blockOffset == address.blockOffset) { //then compare block offset
				return this.byteOffset - address.byteOffset; // finally compare byte offset
			} else {
				return this.blockOffset - address.blockOffset;
			}
		} else {
			return this.fileName.compareTo(address.fileName);
		}

	}

	String get_file_name() {
		return this.fileName;
	}
	int get_block_offset() {
		return this.blockOffset;
	}
	int get_byte_offset() {
		return this.byteOffset;
	}

	void set_file_name(String fileName) {
		this.fileName = fileName;
	}
	void set_block_offset(int blockOffset) {
		this.blockOffset = blockOffset;
	}
	void set_byte_offset(int byteOffset) {
		this.byteOffset = byteOffset;
	}
}

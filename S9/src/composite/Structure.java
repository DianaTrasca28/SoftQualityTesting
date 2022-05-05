package composite;

import java.util.ArrayList;

public class Structure extends ANode{

	//clasa pt elementele care nu sunt frunz
	private ArrayList<ANode>list=new ArrayList<ANode>();
	String nameStructure;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.nameStructure;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		String info="";
		for(ANode node:list){
			info+="\n " + node.getInfo();
		}
		return info;
	}

	
	@Override
	public void addNode(ANode elem) throws Exception {
		list.add(elem);
	}

	@Override
	public void removeNode(ANode elem) throws Exception {
		list.remove(elem);
	}

	@Override
	public ANode getNode(int index) throws Exception {
		return list.get(index);
	}

	public Structure(String nameStructure) {
		super();
		this.nameStructure = nameStructure;
	}
	
	
	
	
}

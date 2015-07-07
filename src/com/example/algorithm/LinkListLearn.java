package com.example.algorithm;

public class LinkListLearn {
	private static LinkList linkList1 = new LinkList();
	private static LinkList linkList2 = new LinkList();
	private static LinkList linkLists = new LinkList();

	public LinkListLearn() {

	}
	
	public LinkList addLinKList(LinkList linkList1,LinkList linkList2){
		LinkList results = new LinkList();
		LinkNode current1 = linkList1.getFront();
		LinkNode current2 = linkList2.getFront();
		int temp =0;//表示进位
		while(current1 != null){
			int sum = current1.data + current2.data;
			if(sum < 10){
				results.addLinkNode(sum+temp);
				temp = 0;
			}else{
				temp =sum / 10;
				results.addLinkNode(sum-10*temp);
			}
			current1 = current1.next;
			current2 = current2.next;
			
		}
		
		return results;
	}
	
	public static void main(String[] args) {
		LinkListLearn ll = new LinkListLearn();
		linkList1.addLinkNode(2);
		linkList1.addLinkNode(4);
		linkList1.addLinkNode(3);
		linkList1.display();
		System.out.println();
		
		linkList2.addLinkNode(5);
		linkList2.addLinkNode(16);
		linkList2.addLinkNode(4);
		linkList2.display();
		System.out.println();
		LinkList results = ll.addLinKList(linkList1, linkList2);
		results.display();
	}
}

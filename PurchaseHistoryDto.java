package jp.co.internous.sunflower.model.domain.dto;


import jp.co.internous.sunflower.model.domain.MstDestination;
import jp.co.internous.sunflower.model.domain.MstProduct;

public class PurchaseHistoryDto {
	
	private long id;
	private long userId;
	private long productId;
	private long productCount;
	private long price;
	private long destinationId;
	private int status;
	private String purchasedAt;
	private String createdAt;
	private String updatedAt;
	private String productName;
	private String familyName;
	private String firstName;
	private String address;
	
	public  PurchaseHistoryDto() {}
	
	public PurchaseHistoryDto(PurchaseHistoryDto purchaseHistoryDto, MstProduct mstProduct, MstDestination mstDestination){
			 this.setId(purchaseHistoryDto.getId());
			 this.setUserId(purchaseHistoryDto.getUserId());
			 this.setProductId(purchaseHistoryDto.getProductId());
			 this.setProductCount(purchaseHistoryDto.getProductCount());
			 this.setPrice(purchaseHistoryDto.getPrice()); 
			 this.setDestinationId(purchaseHistoryDto.getDestinationId());
			 this.setStatus(purchaseHistoryDto.getStatus());
			 this.setPurchasedAt(purchaseHistoryDto.getPurchasedAt());
			 this.setCreatedAt(purchaseHistoryDto.getCreatedAt());
			 this.setUpdatedAt(purchaseHistoryDto.getUpdatedAt());
			 this.setProductName(mstProduct.getProductName());
			 this.setFamilyName(mstDestination.getFamilyName());
			 this.setFirstName(mstDestination.getFirstName());
			 this.setAddress(mstDestination.getAddress());
		 }
		 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public long getProductCount() {
		return productCount;
	}
	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(long destinationId) {
		this.destinationId = destinationId;
	}
	
	public int getStatus() {
		return  status;
	}
	public void setStatus(int  status) {
		this. status = status;
	}
	
	public String getPurchasedAt() {
		return purchasedAt;
	}
	public void setPurchasedAt(String purchasedAt) {
		this.purchasedAt = purchasedAt;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
			this.familyName = familyName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
			this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
			this.address = address;
	}
	
}

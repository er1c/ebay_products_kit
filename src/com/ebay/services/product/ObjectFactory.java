
package com.ebay.services.product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ebay.services.product package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindCompatibilitiesBySpecificationResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findCompatibilitiesBySpecificationResponse");
    private final static QName _AddProductsResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "addProductsResponse");
    private final static QName _GetProductCompatibilitiesResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductCompatibilitiesResponse");
    private final static QName _FindCompatibilitiesBySpecificationRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findCompatibilitiesBySpecificationRequest");
    private final static QName _GetProductCompatibilitiesRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductCompatibilitiesRequest");
    private final static QName _FindProductsRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findProductsRequest");
    private final static QName _GetProductDetailsResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductDetailsResponse");
    private final static QName _FindProductsResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findProductsResponse");
    private final static QName _GetProductDetailsRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductDetailsRequest");
    private final static QName _FindProductsByCompatibilityResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findProductsByCompatibilityResponse");
    private final static QName _GetProductSubmissionsRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductSubmissionsRequest");
    private final static QName _AddProductsRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "addProductsRequest");
    private final static QName _FindProductsByCompatibilityRequest_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "findProductsByCompatibilityRequest");
    private final static QName _GetProductSubmissionsResponse_QNAME = new QName("http://www.ebay.com/marketplace/marketplacecatalog/v1/services", "getProductSubmissionsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ebay.services.product
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindProductsResponse }
     * 
     */
    public FindProductsResponse createFindProductsResponse() {
        return new FindProductsResponse();
    }

    /**
     * Create an instance of {@link FindProductsByCompatibilityRequest }
     * 
     */
    public FindProductsByCompatibilityRequest createFindProductsByCompatibilityRequest() {
        return new FindProductsByCompatibilityRequest();
    }

    /**
     * Create an instance of {@link GetProductSubmissionsResponse }
     * 
     */
    public GetProductSubmissionsResponse createGetProductSubmissionsResponse() {
        return new GetProductSubmissionsResponse();
    }

    /**
     * Create an instance of {@link GetProductSubmissionsRequest }
     * 
     */
    public GetProductSubmissionsRequest createGetProductSubmissionsRequest() {
        return new GetProductSubmissionsRequest();
    }

    /**
     * Create an instance of {@link AddProductsRequest }
     * 
     */
    public AddProductsRequest createAddProductsRequest() {
        return new AddProductsRequest();
    }

    /**
     * Create an instance of {@link GetProductCompatibilitiesRequest }
     * 
     */
    public GetProductCompatibilitiesRequest createGetProductCompatibilitiesRequest() {
        return new GetProductCompatibilitiesRequest();
    }

    /**
     * Create an instance of {@link FindProductsRequest }
     * 
     */
    public FindProductsRequest createFindProductsRequest() {
        return new FindProductsRequest();
    }

    /**
     * Create an instance of {@link FindCompatibilitiesBySpecificationResponse }
     * 
     */
    public FindCompatibilitiesBySpecificationResponse createFindCompatibilitiesBySpecificationResponse() {
        return new FindCompatibilitiesBySpecificationResponse();
    }

    /**
     * Create an instance of {@link AddProductsResponse }
     * 
     */
    public AddProductsResponse createAddProductsResponse() {
        return new AddProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductCompatiblitiesResponse }
     * 
     */
    public GetProductCompatiblitiesResponse createGetProductCompatiblitiesResponse() {
        return new GetProductCompatiblitiesResponse();
    }

    /**
     * Create an instance of {@link FindCompatibilitiesBySpecificationRequest }
     * 
     */
    public FindCompatibilitiesBySpecificationRequest createFindCompatibilitiesBySpecificationRequest() {
        return new FindCompatibilitiesBySpecificationRequest();
    }

    /**
     * Create an instance of {@link GetProductSubmissions }
     * 
     */
    public GetProductSubmissions createGetProductSubmissions() {
        return new GetProductSubmissions();
    }

    /**
     * Create an instance of {@link GetProductDetailsRequest }
     * 
     */
    public GetProductDetailsRequest createGetProductDetailsRequest() {
        return new GetProductDetailsRequest();
    }

    /**
     * Create an instance of {@link AddProducts }
     * 
     */
    public AddProducts createAddProducts() {
        return new AddProducts();
    }

    /**
     * Create an instance of {@link GetProductDetailsResponse }
     * 
     */
    public GetProductDetailsResponse createGetProductDetailsResponse() {
        return new GetProductDetailsResponse();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link NumericValue }
     * 
     */
    public NumericValue createNumericValue() {
        return new NumericValue();
    }

    /**
     * Create an instance of {@link CompatibilitySort }
     * 
     */
    public CompatibilitySort createCompatibilitySort() {
        return new CompatibilitySort();
    }

    /**
     * Create an instance of {@link PaginationInput }
     * 
     */
    public PaginationInput createPaginationInput() {
        return new PaginationInput();
    }

    /**
     * Create an instance of {@link PaginationOutput }
     * 
     */
    public PaginationOutput createPaginationOutput() {
        return new PaginationOutput();
    }

    /**
     * Create an instance of {@link ErrorParameter }
     * 
     */
    public ErrorParameter createErrorParameter() {
        return new ErrorParameter();
    }

    /**
     * Create an instance of {@link URIValue }
     * 
     */
    public URIValue createURIValue() {
        return new URIValue();
    }

    /**
     * Create an instance of {@link ProductSubmission }
     * 
     */
    public ProductSubmission createProductSubmission() {
        return new ProductSubmission();
    }

    /**
     * Create an instance of {@link CompatibilityPropertyFilter }
     * 
     */
    public CompatibilityPropertyFilter createCompatibilityPropertyFilter() {
        return new CompatibilityPropertyFilter();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Media }
     * 
     */
    public Media createMedia() {
        return new Media();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductSubmissionResult }
     * 
     */
    public ProductSubmissionResult createProductSubmissionResult() {
        return new ProductSubmissionResult();
    }

    /**
     * Create an instance of {@link ProductDetailsRequestType }
     * 
     */
    public ProductDetailsRequestType createProductDetailsRequestType() {
        return new ProductDetailsRequestType();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link SortOption }
     * 
     */
    public SortOption createSortOption() {
        return new SortOption();
    }

    /**
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link ProductIdentifier }
     * 
     */
    public ProductIdentifier createProductIdentifier() {
        return new ProductIdentifier();
    }

    /**
     * Create an instance of {@link ErrorData }
     * 
     */
    public ErrorData createErrorData() {
        return new ErrorData();
    }

    /**
     * Create an instance of {@link MediaIdentifier }
     * 
     */
    public MediaIdentifier createMediaIdentifier() {
        return new MediaIdentifier();
    }

    /**
     * Create an instance of {@link CompatibilityDetails }
     * 
     */
    public CompatibilityDetails createCompatibilityDetails() {
        return new CompatibilityDetails();
    }

    /**
     * Create an instance of {@link PropertyValue }
     * 
     */
    public PropertyValue createPropertyValue() {
        return new PropertyValue();
    }

    /**
     * Create an instance of {@link ProductRequest }
     * 
     */
    public ProductRequest createProductRequest() {
        return new ProductRequest();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link ProductStatus }
     * 
     */
    public ProductStatus createProductStatus() {
        return new ProductStatus();
    }

    /**
     * Create an instance of {@link ProductSubmissionFilter }
     * 
     */
    public ProductSubmissionFilter createProductSubmissionFilter() {
        return new ProductSubmissionFilter();
    }

    /**
     * Create an instance of {@link StringValue }
     * 
     */
    public StringValue createStringValue() {
        return new StringValue();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link ProductByCompatibilityRequest }
     * 
     */
    public ProductByCompatibilityRequest createProductByCompatibilityRequest() {
        return new ProductByCompatibilityRequest();
    }

    /**
     * Create an instance of {@link ProductSubmissionStatus }
     * 
     */
    public ProductSubmissionStatus createProductSubmissionStatus() {
        return new ProductSubmissionStatus();
    }

    /**
     * Create an instance of {@link StockPhotoURL }
     * 
     */
    public StockPhotoURL createStockPhotoURL() {
        return new StockPhotoURL();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompatibilitiesBySpecificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findCompatibilitiesBySpecificationResponse")
    public JAXBElement<FindCompatibilitiesBySpecificationResponse> createFindCompatibilitiesBySpecificationResponse(FindCompatibilitiesBySpecificationResponse value) {
        return new JAXBElement<FindCompatibilitiesBySpecificationResponse>(_FindCompatibilitiesBySpecificationResponse_QNAME, FindCompatibilitiesBySpecificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "addProductsResponse")
    public JAXBElement<AddProductsResponse> createAddProductsResponse(AddProductsResponse value) {
        return new JAXBElement<AddProductsResponse>(_AddProductsResponse_QNAME, AddProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCompatiblitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductCompatibilitiesResponse")
    public JAXBElement<GetProductCompatiblitiesResponse> createGetProductCompatibilitiesResponse(GetProductCompatiblitiesResponse value) {
        return new JAXBElement<GetProductCompatiblitiesResponse>(_GetProductCompatibilitiesResponse_QNAME, GetProductCompatiblitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompatibilitiesBySpecificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findCompatibilitiesBySpecificationRequest")
    public JAXBElement<FindCompatibilitiesBySpecificationRequest> createFindCompatibilitiesBySpecificationRequest(FindCompatibilitiesBySpecificationRequest value) {
        return new JAXBElement<FindCompatibilitiesBySpecificationRequest>(_FindCompatibilitiesBySpecificationRequest_QNAME, FindCompatibilitiesBySpecificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCompatibilitiesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductCompatibilitiesRequest")
    public JAXBElement<GetProductCompatibilitiesRequest> createGetProductCompatibilitiesRequest(GetProductCompatibilitiesRequest value) {
        return new JAXBElement<GetProductCompatibilitiesRequest>(_GetProductCompatibilitiesRequest_QNAME, GetProductCompatibilitiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findProductsRequest")
    public JAXBElement<FindProductsRequest> createFindProductsRequest(FindProductsRequest value) {
        return new JAXBElement<FindProductsRequest>(_FindProductsRequest_QNAME, FindProductsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductDetailsResponse")
    public JAXBElement<GetProductDetailsResponse> createGetProductDetailsResponse(GetProductDetailsResponse value) {
        return new JAXBElement<GetProductDetailsResponse>(_GetProductDetailsResponse_QNAME, GetProductDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findProductsResponse")
    public JAXBElement<FindProductsResponse> createFindProductsResponse(FindProductsResponse value) {
        return new JAXBElement<FindProductsResponse>(_FindProductsResponse_QNAME, FindProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductDetailsRequest")
    public JAXBElement<GetProductDetailsRequest> createGetProductDetailsRequest(GetProductDetailsRequest value) {
        return new JAXBElement<GetProductDetailsRequest>(_GetProductDetailsRequest_QNAME, GetProductDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findProductsByCompatibilityResponse")
    public JAXBElement<FindProductsResponse> createFindProductsByCompatibilityResponse(FindProductsResponse value) {
        return new JAXBElement<FindProductsResponse>(_FindProductsByCompatibilityResponse_QNAME, FindProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductSubmissionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductSubmissionsRequest")
    public JAXBElement<GetProductSubmissionsRequest> createGetProductSubmissionsRequest(GetProductSubmissionsRequest value) {
        return new JAXBElement<GetProductSubmissionsRequest>(_GetProductSubmissionsRequest_QNAME, GetProductSubmissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "addProductsRequest")
    public JAXBElement<AddProductsRequest> createAddProductsRequest(AddProductsRequest value) {
        return new JAXBElement<AddProductsRequest>(_AddProductsRequest_QNAME, AddProductsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindProductsByCompatibilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "findProductsByCompatibilityRequest")
    public JAXBElement<FindProductsByCompatibilityRequest> createFindProductsByCompatibilityRequest(FindProductsByCompatibilityRequest value) {
        return new JAXBElement<FindProductsByCompatibilityRequest>(_FindProductsByCompatibilityRequest_QNAME, FindProductsByCompatibilityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductSubmissionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ebay.com/marketplace/marketplacecatalog/v1/services", name = "getProductSubmissionsResponse")
    public JAXBElement<GetProductSubmissionsResponse> createGetProductSubmissionsResponse(GetProductSubmissionsResponse value) {
        return new JAXBElement<GetProductSubmissionsResponse>(_GetProductSubmissionsResponse_QNAME, GetProductSubmissionsResponse.class, null, value);
    }

}

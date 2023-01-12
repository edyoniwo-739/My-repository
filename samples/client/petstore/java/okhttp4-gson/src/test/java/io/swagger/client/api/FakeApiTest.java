/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import java.math.BigDecimal;
import io.swagger.client.model.Client;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.OuterComposite;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    
    /**
     * 
     *
     * Test serialization of outer boolean types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() throws Exception {
        Boolean body = null;
        Boolean response = api.fakeOuterBooleanSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of object with outer number type
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() throws Exception {
        OuterComposite body = null;
        OuterComposite response = api.fakeOuterCompositeSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer number types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() throws Exception {
        BigDecimal body = null;
        BigDecimal response = api.fakeOuterNumberSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Test serialization of outer string types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() throws Exception {
        String body = null;
        String response = api.fakeOuterStringSerialize(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testBodyWithQueryParamsTest() throws Exception {
        User body = null;
        String query = null;
        api.testBodyWithQueryParams(body, query);

        // TODO: test validations
    }
    
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testClientModelTest() throws Exception {
        Client body = null;
        Client response = api.testClientModel(body);

        // TODO: test validations
    }
    
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws Exception {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        byte[] binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);

        // TODO: test validations
    }
    
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testEnumParametersTest() throws Exception {
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        api.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble);

        // TODO: test validations
    }
    
    /**
     * test inline additionalProperties
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() throws Exception {
        Object param = null;
        api.testInlineAdditionalProperties(param);

        // TODO: test validations
    }
    
    /**
     * test json serialization of form data
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() throws Exception {
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2);

        // TODO: test validations
    }
    
}

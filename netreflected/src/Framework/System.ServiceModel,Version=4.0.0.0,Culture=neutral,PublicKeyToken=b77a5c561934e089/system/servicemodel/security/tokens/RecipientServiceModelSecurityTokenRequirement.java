/*
 *  MIT License
 *
 *  Copyright (c) 2020 MASES s.r.l.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

/**************************************************************************************
 * <auto-generated>
 *      This code was generated from a template using JCOReflector version 1.0.0.0
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.servicemodel.security.tokens;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import system.servicemodel.AuditLogLocation;
import system.servicemodel.AuditLevel;
import system.servicemodel.security.SecurityAlgorithmSuite;
import system.servicemodel.channels.SecurityBindingElement;
import system.servicemodel.EndpointAddress;
import system.identitymodel.selectors.SecurityTokenVersion;
import system.identitymodel.tokens.SecurityKeyUsage;
import system.identitymodel.tokens.SecurityKeyType;


/**
 * The base .NET class managing System.ServiceModel.Security.Tokens.RecipientServiceModelSecurityTokenRequirement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class RecipientServiceModelSecurityTokenRequirement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Security.Tokens.RecipientServiceModelSecurityTokenRequirement";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    public static JCType classType = createType();
    static JCEnum enumInstance = null;
    JCObject classInstance = null;

    static JCType createType() {
        try {
            return bridge.GetType(className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName));
        } catch (JCException e) {
            return null;
        }
    }

    void addReference(String ref) throws Throwable {
        try {
            bridge.AddReference(ref);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public RecipientServiceModelSecurityTokenRequirement(Object instance) throws Throwable {
        if (instance instanceof JCObject) {
            classInstance = (JCObject) instance;
        } else
            throw new Exception("Cannot manage object, it is not a JCObject");
    }

    public String getJCOAssemblyName() {
        return assemblyFullName;
    }

    public String getJCOClassName() {
        return className;
    }

    public String getJCOObjectName() {
        return className + ", " + (JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
    }

    public Object getJCOInstance() {
        return classInstance;
    }

    public JCType getJCOType() {
        return classType;
    }

    public static RecipientServiceModelSecurityTokenRequirement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new RecipientServiceModelSecurityTokenRequirement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public RecipientServiceModelSecurityTokenRequirement() throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.IndexOutOfRangeException, system.OutOfMemoryException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    

    
    // Properties section
    
    
    public Uri getListenUri() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("ListenUri");
            return new Uri(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setListenUri(Uri ListenUri) throws Throwable {
        try {
            classInstance.Set("ListenUri", (Object)ListenUri.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditLogLocation getAuditLogLocation() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("AuditLogLocation");
            return new AuditLogLocation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAuditLogLocation(AuditLogLocation AuditLogLocation) throws Throwable {
        try {
            classInstance.Set("AuditLogLocation", (Object)AuditLogLocation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getSuppressAuditFailure() throws Throwable {
        try {
            return (boolean)classInstance.Get("SuppressAuditFailure");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSuppressAuditFailure(boolean SuppressAuditFailure) throws Throwable {
        try {
            classInstance.Set("SuppressAuditFailure", SuppressAuditFailure);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public AuditLevel getMessageAuthenticationAuditLevel() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageAuthenticationAuditLevel");
            return new AuditLevel(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageAuthenticationAuditLevel(AuditLevel MessageAuthenticationAuditLevel) throws Throwable {
        try {
            classInstance.Set("MessageAuthenticationAuditLevel", (Object)MessageAuthenticationAuditLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIsInitiator() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsInitiator");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityAlgorithmSuite getSecurityAlgorithmSuite() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityAlgorithmSuite");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityAlgorithmSuite(SecurityAlgorithmSuite SecurityAlgorithmSuite) throws Throwable {
        try {
            classInstance.Set("SecurityAlgorithmSuite", (Object)SecurityAlgorithmSuite.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityBindingElement getSecurityBindingElement() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityBindingElement");
            return new SecurityBindingElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityBindingElement(SecurityBindingElement SecurityBindingElement) throws Throwable {
        try {
            classInstance.Set("SecurityBindingElement", (Object)SecurityBindingElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public EndpointAddress getIssuerAddress() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuerAddress");
            return new EndpointAddress(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuerAddress(EndpointAddress IssuerAddress) throws Throwable {
        try {
            classInstance.Set("IssuerAddress", (Object)IssuerAddress.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public system.servicemodel.channels.Binding getIssuerBinding() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("IssuerBinding");
            return new system.servicemodel.channels.Binding(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIssuerBinding(system.servicemodel.channels.Binding IssuerBinding) throws Throwable {
        try {
            classInstance.Set("IssuerBinding", (Object)IssuerBinding.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityBindingElement getSecureConversationSecurityBindingElement() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecureConversationSecurityBindingElement");
            return new SecurityBindingElement(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecureConversationSecurityBindingElement(SecurityBindingElement SecureConversationSecurityBindingElement) throws Throwable {
        try {
            classInstance.Set("SecureConversationSecurityBindingElement", (Object)SecureConversationSecurityBindingElement.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityTokenVersion getMessageSecurityVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageSecurityVersion");
            return new SecurityTokenVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageSecurityVersion(SecurityTokenVersion MessageSecurityVersion) throws Throwable {
        try {
            classInstance.Set("MessageSecurityVersion", (Object)MessageSecurityVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTransportScheme() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TransportScheme");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTransportScheme(java.lang.String TransportScheme) throws Throwable {
        try {
            classInstance.Set("TransportScheme", (Object)TransportScheme);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getTokenType() throws Throwable {
        try {
            return (java.lang.String)classInstance.Get("TokenType");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTokenType(java.lang.String TokenType) throws Throwable {
        try {
            classInstance.Set("TokenType", (Object)TokenType);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getRequireCryptographicToken() throws Throwable {
        try {
            return (boolean)classInstance.Get("RequireCryptographicToken");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRequireCryptographicToken(boolean RequireCryptographicToken) throws Throwable {
        try {
            classInstance.Set("RequireCryptographicToken", RequireCryptographicToken);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyUsage getKeyUsage() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyUsage");
            return new SecurityKeyUsage(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyUsage(SecurityKeyUsage KeyUsage) throws Throwable {
        try {
            classInstance.Set("KeyUsage", (Object)KeyUsage.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyType getKeyType() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyType");
            return new SecurityKeyType(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyType(SecurityKeyType KeyType) throws Throwable {
        try {
            classInstance.Set("KeyType", (Object)KeyType.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getKeySize() throws Throwable {
        try {
            return (int)classInstance.Get("KeySize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeySize(int KeySize) throws Throwable {
        try {
            classInstance.Set("KeySize", KeySize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}
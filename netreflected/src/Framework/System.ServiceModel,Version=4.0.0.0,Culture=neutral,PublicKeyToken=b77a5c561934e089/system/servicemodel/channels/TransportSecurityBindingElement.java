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

package system.servicemodel.channels;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.servicemodel.channels.BindingElement;
import system.servicemodel.security.tokens.SupportingTokenParameters;
import system.servicemodel.channels.SecurityHeaderLayout;
import system.servicemodel.MessageSecurityVersion;
import system.servicemodel.security.SecurityAlgorithmSuite;
import system.servicemodel.channels.LocalClientSecuritySettings;
import system.servicemodel.channels.LocalServiceSecuritySettings;
import system.servicemodel.security.SecurityKeyEntropyMode;


/**
 * The base .NET class managing System.ServiceModel.Channels.TransportSecurityBindingElement, System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 */
public class TransportSecurityBindingElement extends NetObject  {
    public static final String assemblyFullName = "System.ServiceModel, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
	public static final String assemblyShortName = "System.ServiceModel";
    public static final String className = "System.ServiceModel.Channels.TransportSecurityBindingElement";
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

    public TransportSecurityBindingElement(Object instance) throws Throwable {
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

    public static TransportSecurityBindingElement castFrom(IJCOBridgeReflected from) throws Throwable {
        return new TransportSecurityBindingElement(from.getJCOInstance());
    }

    // Constructors section
    
    
    public TransportSecurityBindingElement() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.OutOfMemoryException, system.ArgumentOutOfRangeException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public BindingElement Clone() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.OutOfMemoryException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.collections.generic.KeyNotFoundException {
        try {
            JCObject objClone = (JCObject)classInstance.Invoke("Clone");
            return new BindingElement(objClone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void SetKeyDerivation(boolean requireDerivedKeys) throws Throwable {
        try {
            classInstance.Invoke("SetKeyDerivation", requireDerivedKeys);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public SupportingTokenParameters getEndpointSupportingTokenParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("EndpointSupportingTokenParameters");
            return new SupportingTokenParameters(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SupportingTokenParameters getOptionalEndpointSupportingTokenParameters() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("OptionalEndpointSupportingTokenParameters");
            return new SupportingTokenParameters(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityHeaderLayout getSecurityHeaderLayout() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityHeaderLayout");
            return new SecurityHeaderLayout(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityHeaderLayout(SecurityHeaderLayout SecurityHeaderLayout) throws Throwable {
        try {
            classInstance.Set("SecurityHeaderLayout", (Object)SecurityHeaderLayout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public MessageSecurityVersion getMessageSecurityVersion() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("MessageSecurityVersion");
            return new MessageSecurityVersion(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setMessageSecurityVersion(MessageSecurityVersion MessageSecurityVersion) throws Throwable {
        try {
            classInstance.Set("MessageSecurityVersion", (Object)MessageSecurityVersion.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getEnableUnsecuredResponse() throws Throwable {
        try {
            return (boolean)classInstance.Get("EnableUnsecuredResponse");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setEnableUnsecuredResponse(boolean EnableUnsecuredResponse) throws Throwable {
        try {
            classInstance.Set("EnableUnsecuredResponse", EnableUnsecuredResponse);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIncludeTimestamp() throws Throwable {
        try {
            return (boolean)classInstance.Get("IncludeTimestamp");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIncludeTimestamp(boolean IncludeTimestamp) throws Throwable {
        try {
            classInstance.Set("IncludeTimestamp", IncludeTimestamp);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getAllowInsecureTransport() throws Throwable {
        try {
            return (boolean)classInstance.Get("AllowInsecureTransport");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAllowInsecureTransport(boolean AllowInsecureTransport) throws Throwable {
        try {
            classInstance.Set("AllowInsecureTransport", AllowInsecureTransport);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityAlgorithmSuite getDefaultAlgorithmSuite() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("DefaultAlgorithmSuite");
            return new SecurityAlgorithmSuite(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDefaultAlgorithmSuite(SecurityAlgorithmSuite DefaultAlgorithmSuite) throws Throwable {
        try {
            classInstance.Set("DefaultAlgorithmSuite", (Object)DefaultAlgorithmSuite.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getProtectTokens() throws Throwable {
        try {
            return (boolean)classInstance.Get("ProtectTokens");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setProtectTokens(boolean ProtectTokens) throws Throwable {
        try {
            classInstance.Set("ProtectTokens", ProtectTokens);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalClientSecuritySettings getLocalClientSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LocalClientSettings");
            return new LocalClientSecuritySettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public LocalServiceSecuritySettings getLocalServiceSettings() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("LocalServiceSettings");
            return new LocalServiceSecuritySettings(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityKeyEntropyMode getKeyEntropyMode() throws Throwable {
        try {
            JCObject val = (JCObject)classInstance.Get("KeyEntropyMode");
            return new SecurityKeyEntropyMode(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setKeyEntropyMode(SecurityKeyEntropyMode KeyEntropyMode) throws Throwable {
        try {
            classInstance.Set("KeyEntropyMode", (Object)KeyEntropyMode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
}
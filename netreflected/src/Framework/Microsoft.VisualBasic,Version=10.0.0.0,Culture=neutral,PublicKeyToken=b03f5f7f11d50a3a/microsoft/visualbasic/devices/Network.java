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

package microsoft.visualbasic.devices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.Uri;
import microsoft.visualbasic.fileio.UICancelOption;
import microsoft.visualbasic.devices.NetworkAvailableEventHandler;


/**
 * The base .NET class managing Microsoft.VisualBasic.Devices.Network, Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 */
public class Network extends NetObject  {
    public static final String assemblyFullName = "Microsoft.VisualBasic, Version=10.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
	public static final String assemblyShortName = "Microsoft.VisualBasic";
    public static final String className = "Microsoft.VisualBasic.Devices.Network";
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

    public Network(Object instance) throws Throwable {
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

    public static Network castFrom(IJCOBridgeReflected from) throws Throwable {
        return new Network(from.getJCOInstance());
    }

    // Constructors section
    
    
    public Network() throws Throwable {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            classInstance = (JCObject) classType.NewObject();
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    
    public boolean Ping(java.lang.String hostNameOrAddress) throws Throwable, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.net.networkinformation.NetworkInformationException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.NotSupportedException, system.net.sockets.SocketException, system.IndexOutOfRangeException, system.AccessViolationException, system.net.networkinformation.PingException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.Win32Exception {
        try {
            return (boolean)classInstance.Invoke("Ping", (Object)hostNameOrAddress);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(Uri address) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.net.networkinformation.NetworkInformationException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.net.sockets.SocketException, system.AccessViolationException, system.net.networkinformation.PingException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.Win32Exception {
        try {
            return (boolean)classInstance.Invoke("Ping", (Object)address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(Uri address, int timeout) throws Throwable, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.FormatException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.net.networkinformation.NetworkInformationException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.net.sockets.SocketException, system.AccessViolationException, system.net.networkinformation.PingException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.Win32Exception {
        try {
            return (boolean)classInstance.Invoke("Ping", (Object)address.getJCOInstance(), timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.OutOfMemoryException, system.io.IOException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("DownloadFile", (Object)address, (Object)destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.io.IOException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.NotImplementedException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("DownloadFile", (Object)address.getJCOInstance(), (Object)destinationFileName);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.OutOfMemoryException, system.io.IOException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("DownloadFile", (Object)address, (Object)destinationFileName, (Object)userName, (Object)password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.io.IOException, system.MulticastNotSupportedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.NotImplementedException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("DownloadFile", (Object)address.getJCOInstance(), (Object)destinationFileName, (Object)userName, (Object)password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException {
        try {
            classInstance.Invoke("DownloadFile", (Object)address, (Object)destinationFileName, (Object)userName, (Object)password, showUI, connectionTimeout, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(java.lang.String address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.security.cryptography.CryptographicException, system.io.PathTooLongException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.OperationCanceledException {
        try {
            classInstance.Invoke("DownloadFile", (Object)address, (Object)destinationFileName, (Object)userName, (Object)password, showUI, connectionTimeout, overwrite, (Object)onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NullReferenceException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException {
        try {
            classInstance.Invoke("DownloadFile", (Object)address.getJCOInstance(), (Object)destinationFileName, (Object)userName, (Object)password, showUI, connectionTimeout, overwrite);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void DownloadFile(Uri address, java.lang.String destinationFileName, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, boolean overwrite, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.io.PathTooLongException, system.io.IOException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.configuration.ConfigurationErrorsException, system.net.WebException, system.OperationCanceledException {
        try {
            classInstance.Invoke("DownloadFile", (Object)address.getJCOInstance(), (Object)destinationFileName, (Object)userName, (Object)password, showUI, connectionTimeout, overwrite, (Object)onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.NotImplementedException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.UriFormatException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address, (Object)userName, (Object)password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.NotSupportedException, system.OutOfMemoryException, system.resources.MissingManifestResourceException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.ObjectDisposedException, system.NullReferenceException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.NotImplementedException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address.getJCOInstance(), (Object)userName, (Object)password);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.UriFormatException, system.OutOfMemoryException, system.io.FileNotFoundException, system.MulticastNotSupportedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.threading.WaitHandleCannotBeOpenedException, system.componentmodel.InvalidEnumArgumentException, system.net.WebException, system.componentmodel.Win32Exception {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address, (Object)userName, (Object)password, showUI, connectionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.OutOfMemoryException, system.ArgumentOutOfRangeException, system.security.cryptography.CryptographicException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.NotImplementedException, system.NullReferenceException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address.getJCOInstance(), (Object)userName, (Object)password, showUI, connectionTimeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, Uri address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.security.cryptography.CryptographicException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.io.PathTooLongException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.FormatException, system.io.IOException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.UriFormatException, system.componentmodel.InvalidAsynchronousStateException, system.configuration.ConfigurationErrorsException, system.IndexOutOfRangeException, system.net.WebException, system.OverflowException, system.OperationCanceledException {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address.getJCOInstance(), (Object)userName, (Object)password, showUI, connectionTimeout, (Object)onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean Ping(java.lang.String hostNameOrAddress, int timeout) throws Throwable, system.OutOfMemoryException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.ArgumentOutOfRangeException, system.net.networkinformation.NetworkInformationException, system.net.sockets.SocketException, system.NotImplementedException, system.configuration.ConfigurationErrorsException, system.MulticastNotSupportedException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.FormatException, system.IndexOutOfRangeException, system.AccessViolationException, system.net.networkinformation.PingException, system.threading.WaitHandleCannotBeOpenedException, system.io.FileNotFoundException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.componentmodel.Win32Exception {
        try {
            return (boolean)classInstance.Invoke("Ping", (Object)hostNameOrAddress, timeout);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void UploadFile(java.lang.String sourceFileName, java.lang.String address, java.lang.String userName, java.lang.String password, boolean showUI, int connectionTimeout, UICancelOption onUserCancel) throws Throwable, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.ArgumentOutOfRangeException, system.OutOfMemoryException, system.IndexOutOfRangeException, system.FormatException, system.NotImplementedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.security.SecurityException, system.MemberAccessException, system.NullReferenceException, system.UriFormatException, system.security.cryptography.CryptographicException, system.io.FileNotFoundException, system.componentmodel.Win32Exception, system.MulticastNotSupportedException, system.threading.WaitHandleCannotBeOpenedException, system.io.DirectoryNotFoundException, system.UnauthorizedAccessException, system.io.IOException, system.io.PathTooLongException, system.io.DriveNotFoundException, system.OperationCanceledException, system.RankException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.InvalidAsynchronousStateException, system.net.WebException {
        try {
            classInstance.Invoke("UploadFile", (Object)sourceFileName, (Object)address, (Object)userName, (Object)password, showUI, connectionTimeout, (Object)onUserCancel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    
    public boolean getIsAvailable() throws Throwable {
        try {
            return (boolean)classInstance.Get("IsAvailable");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



	// Instance Events section
    
    
    public void addNetworkAvailabilityChanged(NetworkAvailableEventHandler handler) throws Throwable {
        try {
            classInstance.RegisterEventListener("NetworkAvailabilityChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void removeNetworkAvailabilityChanged(NetworkAvailableEventHandler handler) throws Throwable {
        try {
            classInstance.UnregisterEventListener("NetworkAvailabilityChanged", handler);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


}
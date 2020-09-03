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
 *      This code was generated from a template using JCOReflector
 * 
 *      Manual changes to this file may cause unexpected behavior in your application.
 *      Manual changes to this file will be overwritten if the code is regenerated.
 * </auto-generated>
 *************************************************************************************/

package system.directoryservices;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.componentmodel.Component;
import system.directoryservices.DirectoryEntry;
import system.directoryservices.SearchScope;
import system.directoryservices.SearchResult;
import system.directoryservices.SearchResultCollection;
import system.collections.specialized.StringCollection;
import system.directoryservices.DereferenceAlias;
import system.directoryservices.DirectorySynchronization;
import system.directoryservices.DirectoryVirtualListView;
import system.directoryservices.ExtendedDN;
import system.directoryservices.ReferralChasingOption;
import system.directoryservices.SecurityMasks;
import system.directoryservices.SortOption;
import system.TimeSpan;


/**
 * The base .NET class managing System.DirectoryServices.DirectorySearcher, System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.DirectorySearcher" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.DirectoryServices.DirectorySearcher</a>
 */
public class DirectorySearcher extends Component  {
    /**
     * Fully assembly qualified name: System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a
     */
    public static final String assemblyFullName = "System.DirectoryServices, Version=4.0.1.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a";
    /**
     * Assembly name: System.DirectoryServices
     */
    public static final String assemblyShortName = "System.DirectoryServices";
    /**
     * Qualified class name: System.DirectoryServices.DirectorySearcher
     */
    public static final String className = "System.DirectoryServices.DirectorySearcher";
    static JCOBridge bridge = JCOBridgeInstance.getInstance(assemblyFullName);
    /**
     * The type managed from JCOBridge. See {@link JCType}
     */
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

    public DirectorySearcher(Object instance) throws Throwable {
        super(instance);
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

    public void setJCOInstance(JCObject instance) {
        classInstance = instance;
        super.setJCOInstance(classInstance);
    }

    public JCType getJCOType() {
        return classType;
    }
    /**
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link DirectorySearcher}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link DirectorySearcher} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static DirectorySearcher cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new DirectorySearcher(from.getJCOInstance());
    }

    // Constructors section
    
    public DirectorySearcher() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(DirectoryEntry searchRoot) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(searchRoot == null ? null : searchRoot.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(DirectoryEntry searchRoot, java.lang.String filter) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(searchRoot == null ? null : searchRoot.getJCOInstance(), filter));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(DirectoryEntry searchRoot, java.lang.String filter, java.lang.String[] propertiesToLoad) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(searchRoot == null ? null : searchRoot.getJCOInstance(), filter, propertiesToLoad));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(DirectoryEntry searchRoot, java.lang.String filter, java.lang.String[] propertiesToLoad, SearchScope scope) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.ObjectDisposedException, system.InvalidOperationException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.ArrayTypeMismatchException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(searchRoot == null ? null : searchRoot.getJCOInstance(), filter, propertiesToLoad, scope == null ? null : scope.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(java.lang.String filter) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(filter));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(java.lang.String filter, java.lang.String[] propertiesToLoad) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(filter, propertiesToLoad));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySearcher(java.lang.String filter, java.lang.String[] propertiesToLoad, SearchScope scope) throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.FormatException, system.componentmodel.InvalidEnumArgumentException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject(filter, propertiesToLoad, scope == null ? null : scope.getJCOInstance()));
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    
    public SearchResult FindOne() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.NotImplementedException, system.FormatException, system.OutOfMemoryException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindOne = (JCObject)classInstance.Invoke("FindOne");
            return new SearchResult(objFindOne);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SearchResultCollection FindAll() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException, system.InvalidOperationException, system.ObjectDisposedException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.IndexOutOfRangeException, system.NotImplementedException, system.FormatException, system.OutOfMemoryException, system.AccessViolationException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject objFindAll = (JCObject)classInstance.Invoke("FindAll");
            return new SearchResultCollection(objFindAll);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    
    public boolean getAsynchronous() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Asynchronous");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAsynchronous(boolean Asynchronous) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Asynchronous", Asynchronous);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getCacheResults() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CacheResults");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCacheResults(boolean CacheResults) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CacheResults", CacheResults);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getPropertyNamesOnly() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("PropertyNamesOnly");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPropertyNamesOnly(boolean PropertyNamesOnly) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PropertyNamesOnly", PropertyNamesOnly);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getTombstone() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Tombstone");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setTombstone(boolean Tombstone) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Tombstone", Tombstone);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getPageSize() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("PageSize");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setPageSize(int PageSize) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("PageSize", PageSize);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public int getSizeLimit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (int)classInstance.Get("SizeLimit");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSizeLimit(int SizeLimit) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SizeLimit", SizeLimit);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public StringCollection getPropertiesToLoad() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("PropertiesToLoad");
            return new StringCollection(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DereferenceAlias getDerefAlias() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DerefAlias");
            return new DereferenceAlias(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDerefAlias(DereferenceAlias DerefAlias) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DerefAlias", DerefAlias == null ? null : DerefAlias.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryEntry getSearchRoot() throws Throwable, system.ArgumentException, system.ObjectDisposedException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.FormatException, system.TypeLoadException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.InvalidOperationException, system.OverflowException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SearchRoot");
            return new DirectoryEntry(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSearchRoot(DirectoryEntry SearchRoot) throws Throwable, system.NotSupportedException, system.ArgumentNullException, system.ArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SearchRoot", SearchRoot == null ? null : SearchRoot.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectorySynchronization getDirectorySynchronization() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException, system.OutOfMemoryException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("DirectorySynchronization");
            return new DirectorySynchronization(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setDirectorySynchronization(DirectorySynchronization DirectorySynchronization) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("DirectorySynchronization", DirectorySynchronization == null ? null : DirectorySynchronization.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public DirectoryVirtualListView getVirtualListView() throws Throwable, system.ArgumentException, system.IndexOutOfRangeException, system.NotSupportedException, system.ArgumentNullException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.PlatformNotSupportedException, system.ObjectDisposedException, system.OverflowException, system.FormatException, system.ArrayTypeMismatchException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("VirtualListView");
            return new DirectoryVirtualListView(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVirtualListView(DirectoryVirtualListView VirtualListView) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VirtualListView", VirtualListView == null ? null : VirtualListView.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ExtendedDN getExtendedDN() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ExtendedDN");
            return new ExtendedDN(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setExtendedDN(ExtendedDN ExtendedDN) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ExtendedDN", ExtendedDN == null ? null : ExtendedDN.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public ReferralChasingOption getReferralChasing() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ReferralChasing");
            return new ReferralChasingOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setReferralChasing(ReferralChasingOption ReferralChasing) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ReferralChasing", ReferralChasing == null ? null : ReferralChasing.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SearchScope getSearchScope() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SearchScope");
            return new SearchScope(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSearchScope(SearchScope SearchScope) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SearchScope", SearchScope == null ? null : SearchScope.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SecurityMasks getSecurityMasks() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("SecurityMasks");
            return new SecurityMasks(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSecurityMasks(SecurityMasks SecurityMasks) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.componentmodel.InvalidEnumArgumentException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SecurityMasks", SecurityMasks == null ? null : SecurityMasks.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public SortOption getSort() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Sort");
            return new SortOption(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSort(SortOption Sort) throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.InvalidOperationException, system.PlatformNotSupportedException, system.IndexOutOfRangeException, system.NotSupportedException, system.resources.MissingManifestResourceException, system.ObjectDisposedException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Sort", Sort == null ? null : Sort.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getAttributeScopeQuery() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("AttributeScopeQuery");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAttributeScopeQuery(java.lang.String AttributeScopeQuery) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AttributeScopeQuery", AttributeScopeQuery);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public java.lang.String getFilter() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (java.lang.String)classInstance.Get("Filter");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFilter(java.lang.String Filter) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Filter", Filter);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getClientTimeout() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ClientTimeout");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setClientTimeout(TimeSpan ClientTimeout) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ClientTimeout", ClientTimeout == null ? null : ClientTimeout.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getServerPageTimeLimit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerPageTimeLimit");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerPageTimeLimit(TimeSpan ServerPageTimeLimit) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerPageTimeLimit", ServerPageTimeLimit == null ? null : ServerPageTimeLimit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public TimeSpan getServerTimeLimit() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ServerTimeLimit");
            return new TimeSpan(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setServerTimeLimit(TimeSpan ServerTimeLimit) throws Throwable, system.ArgumentException, system.ArgumentNullException, system.ArgumentOutOfRangeException, system.PlatformNotSupportedException, system.globalization.CultureNotFoundException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ServerTimeLimit", ServerTimeLimit == null ? null : ServerTimeLimit.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    


}
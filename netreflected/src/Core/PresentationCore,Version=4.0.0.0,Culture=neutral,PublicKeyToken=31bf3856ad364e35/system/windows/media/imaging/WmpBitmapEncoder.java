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

package system.windows.media.imaging;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.windows.media.imaging.BitmapEncoder;
import system.Single;
import system.windows.media.imaging.Rotation;


/**
 * The base .NET class managing System.Windows.Media.Imaging.WmpBitmapEncoder, PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.WmpBitmapEncoder" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Windows.Media.Imaging.WmpBitmapEncoder</a>
 */
public class WmpBitmapEncoder extends BitmapEncoder  {
    /**
     * Fully assembly qualified name: PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35
     */
    public static final String assemblyFullName = "PresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35";
    /**
     * Assembly name: PresentationCore
     */
    public static final String assemblyShortName = "PresentationCore";
    /**
     * Qualified class name: System.Windows.Media.Imaging.WmpBitmapEncoder
     */
    public static final String className = "System.Windows.Media.Imaging.WmpBitmapEncoder";
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

    public WmpBitmapEncoder(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link WmpBitmapEncoder}, a cast assert is made to check if types are compatible.
	 * @param {@link IJCOBridgeReflected} instance to be casted
	 * @return {@link WmpBitmapEncoder} instance
	 * @throws java.lang.Throwable in case of error during cast operation
     */
    public static WmpBitmapEncoder cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new WmpBitmapEncoder(from.getJCOInstance());
    }

    // Constructors section
    
    public WmpBitmapEncoder() throws Throwable, system.ArgumentException, system.ArgumentOutOfRangeException, system.InvalidOperationException, system.ArgumentNullException, system.componentmodel.InvalidEnumArgumentException, system.componentmodel.Win32Exception, system.FormatException {
        try {
            // add reference to assemblyName.dll file
            addReference(JCOBridgeInstance.getUseFullAssemblyName() ? assemblyFullName : assemblyShortName);
            setJCOInstance((JCObject)classType.NewObject());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Methods section
    

    
    // Properties section
    
    public boolean getCompressedDomainTranscode() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("CompressedDomainTranscode");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setCompressedDomainTranscode(boolean CompressedDomainTranscode) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("CompressedDomainTranscode", CompressedDomainTranscode);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFlipHorizontal() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FlipHorizontal");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlipHorizontal(boolean FlipHorizontal) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FlipHorizontal", FlipHorizontal);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFlipVertical() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FlipVertical");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFlipVertical(boolean FlipVertical) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FlipVertical", FlipVertical);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getFrequencyOrder() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("FrequencyOrder");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setFrequencyOrder(boolean FrequencyOrder) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("FrequencyOrder", FrequencyOrder);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getIgnoreOverlap() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("IgnoreOverlap");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setIgnoreOverlap(boolean IgnoreOverlap) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("IgnoreOverlap", IgnoreOverlap);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getInterleavedAlpha() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("InterleavedAlpha");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setInterleavedAlpha(boolean InterleavedAlpha) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("InterleavedAlpha", InterleavedAlpha);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getLossless() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("Lossless");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setLossless(boolean Lossless) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Lossless", Lossless);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public boolean getUseCodecOptions() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (boolean)classInstance.Get("UseCodecOptions");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setUseCodecOptions(boolean UseCodecOptions) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("UseCodecOptions", UseCodecOptions);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getAlphaDataDiscardLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("AlphaDataDiscardLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlphaDataDiscardLevel(byte AlphaDataDiscardLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AlphaDataDiscardLevel", AlphaDataDiscardLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getAlphaQualityLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("AlphaQualityLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setAlphaQualityLevel(byte AlphaQualityLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("AlphaQualityLevel", AlphaQualityLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getImageDataDiscardLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("ImageDataDiscardLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageDataDiscardLevel(byte ImageDataDiscardLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImageDataDiscardLevel", ImageDataDiscardLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getOverlapLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("OverlapLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setOverlapLevel(byte OverlapLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("OverlapLevel", OverlapLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getQualityLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("QualityLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setQualityLevel(byte QualityLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("QualityLevel", QualityLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public byte getSubsamplingLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (byte)classInstance.Get("SubsamplingLevel");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setSubsamplingLevel(byte SubsamplingLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("SubsamplingLevel", SubsamplingLevel);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short getHorizontalTileSlices() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Get("HorizontalTileSlices");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setHorizontalTileSlices(short HorizontalTileSlices) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("HorizontalTileSlices", HorizontalTileSlices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public short getVerticalTileSlices() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            return (short)classInstance.Get("VerticalTileSlices");
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setVerticalTileSlices(short VerticalTileSlices) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("VerticalTileSlices", VerticalTileSlices);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Single getImageQualityLevel() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("ImageQualityLevel");
            return new Single(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setImageQualityLevel(Single ImageQualityLevel) throws Throwable, system.ArgumentNullException, system.ArgumentException, system.ArgumentOutOfRangeException, system.globalization.CultureNotFoundException, system.resources.MissingManifestResourceException, system.InvalidOperationException, system.ObjectDisposedException, system.IndexOutOfRangeException {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("ImageQualityLevel", ImageQualityLevel == null ? null : ImageQualityLevel.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public Rotation getRotation() throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            JCObject val = (JCObject)classInstance.Get("Rotation");
            return new Rotation(val);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public void setRotation(Rotation Rotation) throws Throwable {
        if (classInstance == null)
            throw new UnsupportedOperationException("classInstance is null.");
        try {
            classInstance.Set("Rotation", Rotation == null ? null : Rotation.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }



    // Instance Events section
    

}
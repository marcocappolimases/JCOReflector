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

package system;

import org.mases.jcobridge.*;
import org.mases.jcobridge.netreflection.*;
import java.util.ArrayList;

// Import section
import system.MidpointRounding;
import system.SByte;
import system.Single;
import system.Decimal;
import system.UInt16;
import system.UInt32;
import system.UInt64;


/**
 * The base .NET class managing System.Math, mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089. Extends {@link NetObject}.
 * <p>
 * 
 * See: <a href="https://docs.microsoft.com/en-us/dotnet/api/System.Math" target="_top">https://docs.microsoft.com/en-us/dotnet/api/System.Math</a>
 */
public class Math extends NetObject  {
    /**
     * Fully assembly qualified name: mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089
     */
    public static final String assemblyFullName = "mscorlib, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089";
    /**
     * Assembly name: mscorlib
     */
    public static final String assemblyShortName = "mscorlib";
    /**
     * Qualified class name: System.Math
     */
    public static final String className = "System.Math";
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

    public Math(Object instance) throws Throwable {
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
     * Try to cast the {@link IJCOBridgeReflected} instance into {@link Math}, a cast assert is made to check if types are compatible.
     * @param from {@link IJCOBridgeReflected} instance to be casted
     * @return {@link Math} instance
     * @throws java.lang.Throwable in case of error during cast operation
     */
    public static Math cast(IJCOBridgeReflected from) throws Throwable {
        NetType.AssertCast(classType, from);
        return new Math(from.getJCOInstance());
    }

    // Constructors section
    
    public Math() throws Throwable {
    }

    
    // Methods section
    
    public static byte Max(byte val1, byte val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("Max", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static byte Min(byte val1, byte val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (byte)classType.Invoke("Min", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Abs(double value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Abs", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Acos(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Acos", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Asin(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Asin", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Atan(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Atan", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Atan2(double y, double x) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Atan2", y, x);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Ceiling(double a) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Ceiling", a);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Cos(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Cos", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Cosh(double value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Cosh", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Exp(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Exp", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Floor(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Floor", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double IEEERemainder(double x, double y) throws Throwable, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("IEEERemainder", x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Log(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Log", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Log(double a, double newBase) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Log", a, newBase);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Log10(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Log10", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Max(double val1, double val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Max", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Min(double val1, double val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Min", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Pow(double x, double y) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Pow", x, y);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Round(double a) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Round", a);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Round(double value, int digits) throws Throwable, system.ArgumentOutOfRangeException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Round", value, digits);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Round(double value, int digits, MidpointRounding mode) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.TypeLoadException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.NotSupportedException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Round", value, digits, mode == null ? null : mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Round(double value, MidpointRounding mode) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Round", value, mode == null ? null : mode.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Sin(double a) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Sin", a);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Sinh(double value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Sinh", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Sqrt(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Sqrt", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Tan(double a) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Tan", a);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Tanh(double value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Tanh", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static double Truncate(double d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (double)classType.Invoke("Truncate", d);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short Abs(short value) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("Abs", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short Max(short val1, short val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("Max", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static short Min(short val1, short val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (short)classType.Invoke("Min", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Abs(int value) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Abs", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Max(int val1, int val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Max", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Min(int val1, int val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Min", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(double value) throws Throwable, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(short value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(int value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(long value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(SByte value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(Single value) throws Throwable, system.ArithmeticException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static int Sign(Decimal value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (int)classType.Invoke("Sign", value == null ? null : value.getJCOInstance());
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Abs(long value) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Abs", value);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long BigMul(int a, int b) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("BigMul", a, b);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Max(long val1, long val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Max", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static long Min(long val1, long val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            return (long)classType.Invoke("Min", val1, val2);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SByte Abs(SByte value) throws Throwable, system.OverflowException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", value == null ? null : value.getJCOInstance());
            return new SByte(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SByte Max(SByte val1, SByte val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new SByte(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static SByte Min(SByte val1, SByte val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new SByte(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Abs(Single value) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", value == null ? null : value.getJCOInstance());
            return new Single(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Max(Single val1, Single val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new Single(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Single Min(Single val1, Single val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new Single(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Abs(Decimal value) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objAbs = (JCObject)classType.Invoke("Abs", value == null ? null : value.getJCOInstance());
            return new Decimal(objAbs);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Ceiling(Decimal d) throws Throwable, system.ArgumentException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objCeiling = (JCObject)classType.Invoke("Ceiling", d == null ? null : d.getJCOInstance());
            return new Decimal(objCeiling);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Floor(Decimal d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objFloor = (JCObject)classType.Invoke("Floor", d == null ? null : d.getJCOInstance());
            return new Decimal(objFloor);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Max(Decimal val1, Decimal val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new Decimal(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Min(Decimal val1, Decimal val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new Decimal(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", d == null ? null : d.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, int decimals) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", d == null ? null : d.getJCOInstance(), decimals);
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, int decimals, MidpointRounding mode) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", d == null ? null : d.getJCOInstance(), decimals, mode == null ? null : mode.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Round(Decimal d, MidpointRounding mode) throws Throwable, system.ArgumentOutOfRangeException, system.ArgumentNullException, system.ArgumentException, system.InvalidOperationException, system.MissingMethodException, system.reflection.TargetInvocationException, system.globalization.CultureNotFoundException, system.OutOfMemoryException, system.FormatException {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objRound = (JCObject)classType.Invoke("Round", d == null ? null : d.getJCOInstance(), mode == null ? null : mode.getJCOInstance());
            return new Decimal(objRound);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static Decimal Truncate(Decimal d) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objTruncate = (JCObject)classType.Invoke("Truncate", d == null ? null : d.getJCOInstance());
            return new Decimal(objTruncate);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 Max(UInt16 val1, UInt16 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt16(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt16 Min(UInt16 val1, UInt16 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt16(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Max(UInt32 val1, UInt32 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt32(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt32 Min(UInt32 val1, UInt32 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt32(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 Max(UInt64 val1, UInt64 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMax = (JCObject)classType.Invoke("Max", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt64(objMax);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }

    public static UInt64 Min(UInt64 val1, UInt64 val2) throws Throwable {
        if (classType == null)
            throw new UnsupportedOperationException("classType is null.");
        try {
            JCObject objMin = (JCObject)classType.Invoke("Min", val1 == null ? null : val1.getJCOInstance(), val2 == null ? null : val2.getJCOInstance());
            return new UInt64(objMin);
        } catch (JCNativeException jcne) {
            throw translateException(jcne);
        }
    }


    
    // Properties section
    


    // Instance Events section
    

}
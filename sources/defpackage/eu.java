package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import com.google.android.chimera.Service;
import java.io.IOException;
import java.util.HashMap;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: eu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eu {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = ew.a;
        sparseIntArray.append(79, 25);
        c.append(80, 26);
        c.append(82, 29);
        c.append(83, 30);
        c.append(89, 36);
        c.append(88, 35);
        c.append(61, 4);
        c.append(60, 3);
        c.append(58, 1);
        c.append(97, 6);
        c.append(98, 7);
        c.append(68, 17);
        c.append(69, 18);
        c.append(70, 19);
        c.append(0, 27);
        c.append(84, 32);
        c.append(85, 33);
        c.append(67, 10);
        c.append(66, 9);
        c.append(101, 13);
        c.append(104, 16);
        c.append(102, 14);
        c.append(99, 11);
        c.append(103, 15);
        c.append(100, 12);
        c.append(92, 40);
        c.append(77, 39);
        c.append(76, 41);
        c.append(91, 42);
        c.append(75, 20);
        c.append(90, 37);
        c.append(65, 5);
        c.append(78, 60);
        c.append(87, 60);
        c.append(81, 60);
        c.append(59, 60);
        c.append(57, 60);
        c.append(5, 24);
        c.append(7, 28);
        c.append(25, 31);
        c.append(26, 8);
        c.append(6, 34);
        c.append(8, 2);
        c.append(3, 23);
        c.append(4, 21);
        c.append(2, 22);
        c.append(15, 43);
        c.append(28, 44);
        c.append(23, 45);
        c.append(24, 46);
        c.append(20, 47);
        c.append(21, 48);
        c.append(16, 49);
        c.append(17, 50);
        c.append(18, 51);
        c.append(19, 52);
        c.append(27, 53);
        c.append(93, 54);
        c.append(71, 55);
        c.append(94, 56);
        c.append(72, 57);
        c.append(95, 58);
        c.append(73, 59);
        c.append(1, 38);
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    et etVar = new et();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, ew.b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        int i3 = c.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    etVar.p = a(obtainStyledAttributes, index, etVar.p);
                                    break;
                                case 2:
                                    etVar.D = obtainStyledAttributes.getDimensionPixelSize(index, etVar.D);
                                    break;
                                case 3:
                                    etVar.o = a(obtainStyledAttributes, index, etVar.o);
                                    break;
                                case 4:
                                    etVar.n = a(obtainStyledAttributes, index, etVar.n);
                                    break;
                                case 5:
                                    etVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    etVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, etVar.x);
                                    break;
                                case 7:
                                    etVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, etVar.y);
                                    break;
                                case 8:
                                    etVar.E = obtainStyledAttributes.getDimensionPixelSize(index, etVar.E);
                                    break;
                                case 9:
                                    etVar.n = a(obtainStyledAttributes, index, etVar.t);
                                    break;
                                case 10:
                                    etVar.s = a(obtainStyledAttributes, index, etVar.s);
                                    break;
                                case 11:
                                    etVar.K = obtainStyledAttributes.getDimensionPixelSize(index, etVar.K);
                                    break;
                                case 12:
                                    etVar.L = obtainStyledAttributes.getDimensionPixelSize(index, etVar.L);
                                    break;
                                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                                    etVar.H = obtainStyledAttributes.getDimensionPixelSize(index, etVar.H);
                                    break;
                                case UrlRequest.Status.READING_RESPONSE /*14*/:
                                    etVar.J = obtainStyledAttributes.getDimensionPixelSize(index, etVar.J);
                                    break;
                                case Service.START_CONTINUATION_MASK:
                                    etVar.M = obtainStyledAttributes.getDimensionPixelSize(index, etVar.M);
                                    break;
                                case 16:
                                    etVar.I = obtainStyledAttributes.getDimensionPixelSize(index, etVar.I);
                                    break;
                                case 17:
                                    etVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, etVar.e);
                                    break;
                                case 18:
                                    etVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, etVar.f);
                                    break;
                                case 19:
                                    etVar.g = obtainStyledAttributes.getFloat(index, etVar.g);
                                    break;
                                case 20:
                                    etVar.u = obtainStyledAttributes.getFloat(index, etVar.u);
                                    break;
                                case 21:
                                    etVar.c = obtainStyledAttributes.getLayoutDimension(index, etVar.c);
                                    break;
                                case 22:
                                    etVar.G = obtainStyledAttributes.getInt(index, etVar.G);
                                    etVar.G = b[etVar.G];
                                    break;
                                case 23:
                                    etVar.b = obtainStyledAttributes.getLayoutDimension(index, etVar.b);
                                    break;
                                case 24:
                                    etVar.A = obtainStyledAttributes.getDimensionPixelSize(index, etVar.A);
                                    break;
                                case 25:
                                    etVar.h = a(obtainStyledAttributes, index, etVar.h);
                                    break;
                                case 26:
                                    etVar.i = a(obtainStyledAttributes, index, etVar.i);
                                    break;
                                case 27:
                                    etVar.z = obtainStyledAttributes.getInt(index, etVar.z);
                                    break;
                                case 28:
                                    etVar.B = obtainStyledAttributes.getDimensionPixelSize(index, etVar.B);
                                    break;
                                case 29:
                                    etVar.j = a(obtainStyledAttributes, index, etVar.j);
                                    break;
                                case 30:
                                    etVar.k = a(obtainStyledAttributes, index, etVar.k);
                                    break;
                                case 31:
                                    etVar.F = obtainStyledAttributes.getDimensionPixelSize(index, etVar.F);
                                    break;
                                case 32:
                                    etVar.q = a(obtainStyledAttributes, index, etVar.q);
                                    break;
                                case 33:
                                    etVar.r = a(obtainStyledAttributes, index, etVar.r);
                                    break;
                                case 34:
                                    etVar.C = obtainStyledAttributes.getDimensionPixelSize(index, etVar.C);
                                    break;
                                case 35:
                                    etVar.m = a(obtainStyledAttributes, index, etVar.m);
                                    break;
                                case 36:
                                    etVar.l = a(obtainStyledAttributes, index, etVar.l);
                                    break;
                                case 37:
                                    etVar.v = obtainStyledAttributes.getFloat(index, etVar.v);
                                    break;
                                case 38:
                                    etVar.d = obtainStyledAttributes.getResourceId(index, etVar.d);
                                    break;
                                case 39:
                                    etVar.O = obtainStyledAttributes.getFloat(index, etVar.O);
                                    break;
                                case 40:
                                    etVar.N = obtainStyledAttributes.getFloat(index, etVar.N);
                                    break;
                                case 41:
                                    etVar.P = obtainStyledAttributes.getInt(index, etVar.P);
                                    break;
                                case 42:
                                    etVar.Q = obtainStyledAttributes.getInt(index, etVar.Q);
                                    break;
                                case 43:
                                    etVar.R = obtainStyledAttributes.getFloat(index, etVar.R);
                                    break;
                                case 44:
                                    etVar.S = true;
                                    etVar.T = obtainStyledAttributes.getFloat(index, etVar.T);
                                    break;
                                case 45:
                                    etVar.U = obtainStyledAttributes.getFloat(index, etVar.U);
                                    break;
                                case 46:
                                    etVar.V = obtainStyledAttributes.getFloat(index, etVar.V);
                                    break;
                                case 47:
                                    etVar.W = obtainStyledAttributes.getFloat(index, etVar.W);
                                    break;
                                case 48:
                                    etVar.X = obtainStyledAttributes.getFloat(index, etVar.X);
                                    break;
                                case 49:
                                    etVar.Y = obtainStyledAttributes.getFloat(index, etVar.Y);
                                    break;
                                case 50:
                                    etVar.Z = obtainStyledAttributes.getFloat(index, etVar.Z);
                                    break;
                                case 51:
                                    etVar.aa = obtainStyledAttributes.getFloat(index, etVar.aa);
                                    break;
                                case 52:
                                    etVar.ab = obtainStyledAttributes.getFloat(index, etVar.ab);
                                    break;
                                case 53:
                                    etVar.ac = obtainStyledAttributes.getFloat(index, etVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        etVar.a = true;
                    }
                    this.a.put(Integer.valueOf(etVar.d), etVar);
                }
            }
        } catch (XmlPullParserException e) {
            apev.a(e);
        } catch (IOException e2) {
            apev.a(e2);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: amu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amu {
    private static final Class[] b = {Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();
    public final Context a;
    private final Object[] d = new Object[2];
    private final amy e;
    private final String[] f;

    public amu(Context context, amy amy) {
        this.a = context;
        this.e = amy;
        this.f = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    private final Preference a(String str, AttributeSet attributeSet) {
        try {
            if (str.indexOf(46) == -1) {
                return a(str, this.f, attributeSet);
            }
            return a(str, (String[]) null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }, ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.preference.Preference a(java.lang.String r11, java.lang.String[] r12, android.util.AttributeSet r13) {
        /*
            r10 = this;
            java.util.HashMap r0 = c
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x0071
            android.content.Context r0 = r10.a     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r3 = 0
            if (r12 == 0) goto L_0x005a
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            if (r4 != 0) goto L_0x001a
            goto L_0x005a
        L_0x001a:
            r5 = 0
            r7 = r5
            r6 = 0
        L_0x001d:
            if (r6 >= r4) goto L_0x0039
            r8 = r12[r6]     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            r9.append(r8)     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            r9.append(r11)     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            java.lang.String r8 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            java.lang.Class r5 = java.lang.Class.forName(r8, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0035, Exception -> 0x006d }
            goto L_0x0039
        L_0x0035:
            r7 = move-exception
            int r6 = r6 + 1
            goto L_0x001d
        L_0x0039:
            if (r5 != 0) goto L_0x005e
            if (r7 != 0) goto L_0x0059
            android.view.InflateException r12 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.String r2 = r13.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r0.append(r11)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r12.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            throw r12     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
        L_0x0059:
            throw r7     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
        L_0x005a:
            java.lang.Class r5 = java.lang.Class.forName(r11, r3, r0)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
        L_0x005e:
            java.lang.Class[] r12 = b     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r12)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.util.HashMap r12 = c     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r12.put(r11, r0)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            goto L_0x0072
        L_0x006d:
            r12 = move-exception
            goto L_0x007d
        L_0x006f:
            r11 = move-exception
            goto L_0x009c
        L_0x0071:
        L_0x0072:
            java.lang.Object[] r12 = r10.d     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            java.lang.Object r12 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            androidx.preference.Preference r12 = (androidx.preference.Preference) r12     // Catch:{ ClassNotFoundException -> 0x006f, Exception -> 0x006d }
            return r12
        L_0x007d:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r2.append(r13)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            r0.initCause(r12)
            throw r0
        L_0x009c:
            goto L_0x009e
        L_0x009d:
            throw r11
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amu.a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    private final void a(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.u = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.a.getResources();
                    if (preference.w == null) {
                        preference.w = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.w);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference a2 = a(name, attributeSet);
                    ((PreferenceGroup) preference).a(a2);
                    a(xmlPullParser, a2, attributeSet);
                }
            }
        }
    }

    public final Preference a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.d) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.d[0] = this.a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) a(xmlPullParser.getName(), asAttributeSet);
                        if (preferenceGroup == null) {
                            preferenceGroup2.a(this.e);
                            preferenceGroup = preferenceGroup2;
                        }
                        a(xmlPullParser, (Preference) preferenceGroup, asAttributeSet);
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException = new InflateException(e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (IOException e4) {
                    InflateException inflateException2 = new InflateException(xmlPullParser.getPositionDescription() + ": " + e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
        }
        return preferenceGroup;
    }
}

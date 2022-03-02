package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: ivu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivu {
    public static String a(String str, String str2, Context context, AttributeSet attributeSet, String str3) {
        String str4;
        if (attributeSet != null) {
            str4 = attributeSet.getAttributeValue(str, str2);
        } else {
            str4 = null;
        }
        if (str4 == null || !str4.startsWith("@string/")) {
            return str4;
        }
        String substring = str4.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            Resources resources = context.getResources();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 8 + String.valueOf(substring).length());
            sb.append(packageName);
            sb.append(":string/");
            sb.append(substring);
            resources.getValue(sb.toString(), typedValue, true);
        } catch (Resources.NotFoundException e) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 30 + String.valueOf(str4).length());
            sb2.append("Could not find resource for ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str4);
            Log.w(str3, sb2.toString());
        }
        if (typedValue.string != null) {
            return typedValue.string.toString();
        }
        String valueOf = String.valueOf(typedValue);
        StringBuilder sb3 = new StringBuilder(str2.length() + 28 + String.valueOf(valueOf).length());
        sb3.append("Resource ");
        sb3.append(str2);
        sb3.append(" was not a string: ");
        sb3.append(valueOf);
        Log.w(str3, sb3.toString());
        return str4;
    }
}

package defpackage;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: xds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xds {
    public static void a(Object obj, String str, StringBuilder sb) {
        if (obj != null) {
            String concat = String.valueOf(str).concat("  ");
            sb.append("(");
            sb.append(obj.getClass().getSimpleName());
            sb.append(") ");
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (bundle.isEmpty()) {
                    sb.append("{ }\n");
                    return;
                }
                sb.append("{\n");
                for (String str2 : bundle.keySet()) {
                    sb.append(concat);
                    sb.append(str2);
                    sb.append(" : ");
                    a(bundle.get(str2), concat, sb);
                }
                sb.append(str);
                sb.append("}\n");
            } else if (obj instanceof DataHolder) {
                DataHolder dataHolder = (DataHolder) obj;
                sb.append(" [");
                if (dataHolder.b()) {
                    sb.append("CLOSED");
                } else {
                    sb.append(dataHolder.h);
                }
                sb.append("] ");
                sb.append(obj);
                sb.append("\n");
            } else {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.isEmpty()) {
                        sb.append("[ ]\n");
                        return;
                    }
                    sb.append("[\n");
                    for (int i = 0; i < arrayList.size(); i++) {
                        sb.append(concat);
                        sb.append(i);
                        sb.append(" : ");
                        a(arrayList.get(i), concat, sb);
                    }
                    sb.append(str);
                    sb.append("]\n");
                } else if (obj instanceof byte[]) {
                    int length = ((byte[]) obj).length;
                    sb.append(" [");
                    sb.append(length);
                    sb.append("] ");
                    int min = Math.min(length, 56);
                    byte[] bArr = new byte[min];
                    System.arraycopy(obj, 0, bArr, 0, min);
                    sb.append(Base64.encodeToString(bArr, 0));
                } else if (obj instanceof char[]) {
                    sb.append("\"");
                    sb.append((char[]) obj);
                    sb.append("\"\n");
                } else if (obj.getClass().isArray()) {
                    if (Array.getLength(obj) == 0) {
                        sb.append("[ ]\n");
                        return;
                    }
                    sb.append("[ ");
                    sb.append(Array.get(obj, 0));
                    for (int i2 = 1; i2 < Array.getLength(obj); i2++) {
                        sb.append(", ");
                        sb.append(Array.get(obj, i2));
                    }
                    sb.append(" ]\n");
                } else if (obj instanceof String) {
                    sb.append("\"");
                    sb.append(obj);
                    sb.append("\"\n");
                } else {
                    sb.append(obj);
                    sb.append("\n");
                }
            }
        } else {
            sb.append("[null]\n");
        }
    }
}

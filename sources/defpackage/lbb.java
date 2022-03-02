package defpackage;

import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: lbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lbb {
    private static final ith a = new ith("MetadataBufferConversio", "");

    public static File a(MetadataBundle metadataBundle) {
        File file = new File();
        for (kyq a2 : metadataBundle.c()) {
            lbc a3 = lap.a(a2);
            iva.a((Object) metadataBundle, (Object) "changeSet");
            iva.a((Object) file, (Object) "serverFile");
            Object a4 = metadataBundle.a(a3.b);
            if (a4 != null) {
                a3.a(file, a4);
            }
        }
        return file;
    }

    public static JSONObject b(MetadataBundle metadataBundle) {
        JSONObject jSONObject = new JSONObject();
        for (kyq a2 : metadataBundle.c()) {
            lbc a3 = lap.a(a2);
            iva.a((Object) metadataBundle, (Object) "collection");
            iva.a((Object) jSONObject, (Object) "jsonObject");
            if (metadataBundle.c(a3.b)) {
                Object a4 = metadataBundle.a(a3.b);
                if (a4 == null) {
                    jSONObject.put(a3.b.a(), JSONObject.NULL);
                } else {
                    a3.a(jSONObject, a4);
                }
            }
        }
        return jSONObject;
    }

    public static MetadataBundle a(kmp kmp, String str) {
        MetadataBundle a2 = MetadataBundle.a();
        for (kyq a3 : lbm.a()) {
            lbc a4 = lap.a(a3);
            iva.a((Object) kmp, (Object) "entry");
            iva.a((Object) a2, (Object) "changeSet");
            a2.b(a4.b, a4.a(kmp, str));
        }
        return a2;
    }

    public static MetadataBundle a(JSONObject jSONObject) {
        MetadataBundle a2 = MetadataBundle.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            kyq a3 = lbm.a(next);
            if (a3 != null) {
                lbc a4 = lap.a(a3);
                iva.a((Object) jSONObject, (Object) "jsonObject");
                iva.a((Object) a2, (Object) "collection");
                if (jSONObject.has(a4.b.a())) {
                    if (jSONObject.get(a4.b.a()).equals(JSONObject.NULL)) {
                        a2.b(a4.b, (Object) null);
                    } else {
                        a2.b(a4.b, a4.a(jSONObject));
                    }
                }
            } else {
                a.b("Ignored unknown metadata field in JSON: %s", next);
            }
        }
        return a2;
    }

    public static void a(kmp kmp, knl knl, long j, String str, MetadataBundle metadataBundle) {
        iva.a((Object) knl, (Object) "GenoaValues should always be passed when writing to entry.");
        MetadataBundle a2 = MetadataBundle.a();
        for (kyq a3 : metadataBundle.c()) {
            lbc a4 = lap.a(a3);
            iva.a((Object) kmp, (Object) "entry");
            iva.a((Object) metadataBundle, (Object) "changeSet");
            iva.a((Object) a2, (Object) "undoChangeSet");
            kyq kyq = a4.b;
            a2.b(kyq, a4.a(kmp, str, metadataBundle.a(kyq)));
            a4.a(kmp, knl, j);
            iva.a((Object) metadataBundle, (Object) "changeSet");
            iva.a((Object) kmp, (Object) "entry");
            a4.a(kmp, str, metadataBundle.a(a4.b), j);
        }
    }
}

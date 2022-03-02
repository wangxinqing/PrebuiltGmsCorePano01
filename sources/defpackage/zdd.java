package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* renamed from: zdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdd extends iyv {
    public final izb a;

    public zdd(izb izb) {
        this.a = izb;
        izb.g = 6400;
    }

    public static String b(String str) {
        return String.format("people/%1$s", new Object[]{iyv.a(str)});
    }

    public final jag a(ClientContext clientContext, String str, Class cls, FieldMappingDictionary fieldMappingDictionary) {
        return this.a.a(clientContext, 0, b(str), (Object) null, cls, fieldMappingDictionary);
    }
}

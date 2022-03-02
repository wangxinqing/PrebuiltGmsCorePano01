package defpackage;

import com.google.android.gms.plus.service.v2whitelisted.models.PeopleList;
import java.util.List;

/* renamed from: xdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xdx implements xuz {
    private static final iyu i;
    private final zin a;
    private final xpk b;
    private final List c;
    private final String d;
    private final int e;
    private final String f;
    private final String g;
    private final Boolean h;

    static {
        iyu iyu = new iyu();
        iyu.a("items(etag,id,names,nicknames,images,urls,sortKeys,taglines,emails,phoneNumbers,addresses,metadata,memberships,legacyFields/mobileOwnerId)");
        iyu.a("nextPageToken");
        iyu.a("nextSyncToken");
        i = iyu;
    }

    public xdx(zin zin, xpk xpk, List list, String str, int i2, String str2, String str3, Boolean bool) {
        this.a = zin;
        this.b = xpk;
        this.c = list;
        this.d = str;
        this.e = i2;
        this.f = str2;
        this.g = str3;
        this.h = bool;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return this.a.a(this.b.a, "me", "all", this.d, this.h, this.c, true, Integer.valueOf(this.e), this.b.b, this.f, str, this.g, i);
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return ((PeopleList) obj).d;
    }
}

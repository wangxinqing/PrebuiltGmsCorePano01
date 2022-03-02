package defpackage;

import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.CustomProperty;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: lgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lgb implements ljf {
    final /* synthetic */ lgc a;

    public lgb(lgc lgc) {
        this.a = lgc;
    }

    private final ambp b(kyq kyq, Object obj) {
        if (kyq == liu.a) {
            return ambp.FIELD_TITLE;
        }
        if (kyq == liu.b) {
            return ambp.FIELD_MIME_TYPE;
        }
        if (kyq == liu.c) {
            return ambp.FIELD_TRASHED;
        }
        if (kyq == liu.d) {
            return ambp.FIELD_PARENTS;
        }
        if (kyq == liu.h) {
            return ambp.FIELD_SHARED_WITH_ME_DATE;
        }
        if (kyq == liu.e) {
            return ambp.FIELD_STARRED;
        }
        if (kyq == liu.i) {
            return ambp.FIELD_MODIFIED_DATE;
        }
        if (kyq == liu.j) {
            return ambp.FIELD_LAST_VIEWED_BY_ME;
        }
        if (kyq == liu.f) {
            return ambp.FIELD_IS_PINNED;
        }
        if (kyq != liu.g) {
            lgc.a.b("ImpressionLogEvent", "Unknown field name: %s", kyq.a());
            return ambp.UNKNOWN_METADATA_FIELD;
        } else if (obj == null) {
            lgc.a.b("ImpressionLogEvent", "FieldOnly() with CUSTOM_FILE_PROPERTIES in %s", this.a.c);
            return ambp.UNKNOWN_METADATA_FIELD;
        } else if (((CustomProperty) ((AppVisibleCustomProperties) obj).iterator().next()).a.b == 0) {
            return ambp.FIELD_CUSTOM_PROPERTY_PUBLIC;
        } else {
            return ambp.FIELD_CUSTOM_PROPERTY_PRIVATE;
        }
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return Collections.singleton(ambp.FIELD_OWNED_BY_ME);
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, List list) {
        ob obVar = new ob();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            obVar.addAll((Set) list.get(i));
        }
        return obVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Operator operator, kyq kyq, Object obj) {
        return Collections.singleton(b(kyq, (Object) null));
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return (Set) obj;
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        return Collections.singleton(ambp.FIELD_FULL_TEXT);
    }

    public final /* bridge */ /* synthetic */ Object a(kym kym, Object obj) {
        return Collections.singleton(b(kym, (Object) null));
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq) {
        return Collections.singleton(b(kyq, (Object) null));
    }

    public final /* bridge */ /* synthetic */ Object a(kyq kyq, Object obj) {
        return Collections.singleton(b(kyq, obj));
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return Collections.EMPTY_SET;
    }
}

package defpackage;

import com.google.android.ulr.FeatureIdProto;

/* renamed from: alkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alkq {
    public static auip a(FeatureIdProto featureIdProto) {
        if (featureIdProto == null) {
            return null;
        }
        aucd o = auip.c.o();
        if (((String) featureIdProto.b.get("cellId")) != null) {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.FeatureIdProto.cell_id");
        } else if (((String) featureIdProto.b.get("fprint")) == null) {
            return (auip) o.i();
        } else {
            throw new IllegalArgumentException("Json2LiteBadNotNull location.unified.FeatureIdProto.fprint");
        }
    }
}

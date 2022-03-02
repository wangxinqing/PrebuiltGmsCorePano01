package defpackage;

import com.google.android.gms.people.identity.internal.models.PersonImpl;

/* renamed from: wxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wxi implements wwl {
    public static PersonImpl.MetadataImpl a(wwj wwj) {
        PersonImpl.MetadataImpl metadataImpl = new PersonImpl.MetadataImpl();
        metadataImpl.a(wwj.e);
        metadataImpl.c(!wwj.d);
        metadataImpl.b = "cp2";
        metadataImpl.d = wwj.a;
        metadataImpl.a(Integer.parseInt(wwj.b));
        return metadataImpl;
    }
}

package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;

/* renamed from: yti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yti extends bhv implements ytk {
    public yti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusInternalCallbacks");
    }

    public final void a(int i, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        b(12, aQ);
    }

    public final void b(int i, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) null);
        b(9, aQ);
    }

    public final void a(int i, Bundle bundle, Bundle bundle2) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) bundle2);
        b(1, aQ);
    }

    public final void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) parcelFileDescriptor);
        b(2, aQ);
    }

    public final void a(int i, Bundle bundle, AclsResponse aclsResponse) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) aclsResponse);
        b(20, aQ);
    }

    public final void a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
        Parcel aQ = aQ();
        aQ.writeInt(0);
        bhx.a(aQ, (Parcelable) null);
        bhx.a(aQ, (Parcelable) appAclsEntity);
        b(24, aQ);
    }

    public final void a(int i, Bundle bundle, Comment comment) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) comment);
        b(21, aQ);
    }

    public final void a(int i, Bundle bundle, Post post) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) post);
        b(13, aQ);
    }

    public final void a(int i, Bundle bundle, Settings settings) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) settings);
        b(14, aQ);
    }

    public final void a(int i, Bundle bundle, MomentsFeed momentsFeed) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) momentsFeed);
        b(6, aQ);
    }

    public final void a(int i, Bundle bundle, PeopleFeed peopleFeed) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) peopleFeed);
        b(19, aQ);
    }

    public final void a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        bhx.a(aQ, (Parcelable) upgradeAccountEntity);
        b(18, aQ);
    }

    public final void a(int i, Bundle bundle, String str) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeString(str);
        b(15, aQ);
    }

    public final void a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) appAclsEntity);
        b(11, aQ);
    }

    public final void a(int i, Bundle bundle, List list) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        aQ.writeTypedList(list);
        b(16, aQ);
    }

    public final void a(DataHolder dataHolder, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        aQ.writeString(str);
        b(8, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(3, aQ);
    }
}

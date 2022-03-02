package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.Service;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.model.posts.Comment;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.service.v1whitelisted.models.MomentsFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;
import org.chromium.net.UrlRequest;

/* renamed from: ytj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ytj extends bhw implements ytk {
    public ytj() {
        super("com.google.android.gms.plus.internal.IPlusInternalCallbacks");
    }

    public void a(int i, Bundle bundle) {
    }

    public void a(int i, Bundle bundle, Bundle bundle2) {
    }

    public void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
    }

    public final void a(int i, Bundle bundle, AclsResponse aclsResponse) {
    }

    public void a(int i, Bundle bundle, AppAclsEntity appAclsEntity) {
    }

    public void a(int i, Bundle bundle, Comment comment) {
    }

    public void a(int i, Bundle bundle, Post post) {
    }

    public void a(int i, Bundle bundle, Settings settings) {
    }

    public void a(int i, Bundle bundle, MomentsFeed momentsFeed) {
    }

    public void a(int i, Bundle bundle, PeopleFeed peopleFeed) {
    }

    public void a(int i, Bundle bundle, UpgradeAccountEntity upgradeAccountEntity) {
    }

    public void a(int i, Bundle bundle, String str) {
    }

    public void a(int i, Bundle bundle, String str, AppAclsEntity appAclsEntity) {
    }

    public void a(int i, Bundle bundle, List list) {
    }

    public void a(DataHolder dataHolder, String str) {
    }

    public void a(String str) {
    }

    public void b(int i, Bundle bundle) {
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 3:
                a(parcel.readString());
                break;
            case 6:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (MomentsFeed) bhx.a(parcel, MomentsFeed.CREATOR));
                break;
            case 8:
                a((DataHolder) bhx.a(parcel, DataHolder.CREATOR), parcel.readString());
                break;
            case 9:
                Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                b(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                parcel.readInt();
                Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                parcel.readString();
                parcel.createStringArrayList();
                parcel.createStringArrayList();
                parcel.createStringArrayList();
                break;
            case 11:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), parcel.readString(), (AppAclsEntity) bhx.a(parcel, AppAclsEntity.CREATOR));
                break;
            case 12:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR));
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Post) bhx.a(parcel, Post.CREATOR));
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Settings) bhx.a(parcel, Settings.CREATOR));
                break;
            case Service.START_CONTINUATION_MASK:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), parcel.readString());
                break;
            case 16:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (List) parcel.createTypedArrayList(AudienceMember.CREATOR));
                break;
            case 18:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (UpgradeAccountEntity) bhx.a(parcel, UpgradeAccountEntity.CREATOR));
                break;
            case 19:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (PeopleFeed) bhx.a(parcel, PeopleFeed.CREATOR));
                break;
            case 20:
                parcel.readInt();
                Bundle bundle3 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                AclsResponse aclsResponse = (AclsResponse) bhx.a(parcel, AclsResponse.CREATOR);
                break;
            case 21:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (Comment) bhx.a(parcel, Comment.CREATOR));
                break;
            case 24:
                a(parcel.readInt(), (Bundle) bhx.a(parcel, Bundle.CREATOR), (AppAclsEntity) bhx.a(parcel, AppAclsEntity.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

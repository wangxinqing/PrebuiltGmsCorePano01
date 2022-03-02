package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import org.chromium.net.UrlRequest;

/* renamed from: dtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dtm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String str2 = null;
        String str3 = "0";
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) ivw.b(parcel2, readInt, RegisterSectionInfo.CREATOR);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) ivw.a(parcel2, readInt, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) ivw.a(parcel2, readInt, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new RegisterCorpusInfo(str, str3, uri, registerSectionInfoArr, globalSearchCorpusConfig, z, account, registerCorpusIMEInfo, str2, z2, i);
    }
}

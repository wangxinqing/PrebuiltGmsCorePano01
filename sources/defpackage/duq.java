package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import org.chromium.net.UrlRequest;

/* renamed from: duq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class duq extends bhw implements dur {
    public duq() {
        super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                SearchResults a = a(parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt(), parcel.readInt(), (QuerySpecification) bhx.a(parcel, QuerySpecification.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a);
                break;
            case 2:
                SuggestionResults a2 = a(parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt(), (SuggestSpecification) bhx.a(parcel, SuggestSpecification.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a2);
                break;
            case 3:
                DocumentResults a3 = a(parcel.createStringArray(), parcel.readString(), parcel.readString(), (QuerySpecification) bhx.a(parcel, QuerySpecification.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a3);
                break;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                long readLong = parcel.readLong();
                RequestIndexingSpecification requestIndexingSpecification = (RequestIndexingSpecification) bhx.a(parcel, RequestIndexingSpecification.CREATOR);
                boolean a4 = a(readString, readString2, readLong);
                parcel2.writeNoException();
                bhx.a(parcel2, a4);
                break;
            case 5:
                CorpusStatus b = b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                bhx.b(parcel2, b);
                break;
            case 6:
                String[] a5 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(a5);
                break;
            case 7:
                a(parcel.readString(), (RegisterCorpusInfo) bhx.a(parcel, RegisterCorpusInfo.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                Bundle a6 = a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                bhx.b(parcel2, a6);
                break;
            case 9:
                Bundle a7 = a((Bundle) bhx.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a7);
                break;
            case 10:
                SearchResults a8 = a(parcel.readString(), parcel.readInt(), parcel.readInt(), (GlobalSearchQuerySpecification) bhx.a(parcel, GlobalSearchQuerySpecification.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a8);
                break;
            case 11:
                a((GlobalSearchApplicationInfo) bhx.a(parcel, GlobalSearchApplicationInfo.CREATOR));
                parcel2.writeNoException();
                break;
            case 12:
                c(parcel.readString());
                parcel2.writeNoException();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                GlobalSearchApplicationInfo[] a9 = a();
                parcel2.writeNoException();
                parcel2.writeTypedArray(a9, 1);
                break;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                boolean b2 = b(parcel.readString(), (RegisterCorpusInfo) bhx.a(parcel, RegisterCorpusInfo.CREATOR));
                parcel2.writeNoException();
                bhx.a(parcel2, b2);
                break;
            case 16:
                a(parcel.createStringArray());
                parcel2.writeNoException();
                break;
            case 17:
                b(parcel.createStringArray());
                parcel2.writeNoException();
                break;
            case 18:
                f();
                parcel2.writeNoException();
                break;
            case 19:
                ResultClickInfo resultClickInfo = (ResultClickInfo) bhx.a(parcel, ResultClickInfo.CREATOR);
                parcel2.writeNoException();
                bhx.a(parcel2, l());
                break;
            case 20:
                parcel.readString();
                parcel2.writeNoException();
                bhx.a(parcel2, k());
                break;
            case 21:
                parcel.readString();
                parcel2.writeNoException();
                break;
            case 22:
                parcel.readString();
                String[] i2 = i();
                parcel2.writeNoException();
                parcel2.writeStringArray(i2);
                break;
            case 23:
                parcel.readString();
                parcel.readInt();
                parcel.createByteArray();
                PIMEUpdateResponse j = j();
                parcel2.writeNoException();
                bhx.b(parcel2, j);
                break;
            case 24:
                PhraseAffinityResponse a10 = a(parcel.createStringArray(), (PhraseAffinitySpecification) bhx.a(parcel, PhraseAffinitySpecification.CREATOR));
                parcel2.writeNoException();
                bhx.b(parcel2, a10);
                break;
            case 25:
                RegisterCorpusInfo c = c(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                bhx.b(parcel2, c);
                break;
            case 27:
                String[] b3 = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(b3);
                break;
            case 28:
                StorageStats c2 = c();
                parcel2.writeNoException();
                bhx.b(parcel2, c2);
                break;
            case 29:
                GlobalSearchApplication[] b4 = b();
                parcel2.writeNoException();
                parcel2.writeTypedArray(b4, 1);
                break;
            case 30:
                parcel.createByteArray();
                bhx.a(parcel);
                parcel2.writeNoException();
                bhx.a(parcel2, m());
                break;
            case 31:
                int[] g = g();
                parcel2.writeNoException();
                parcel2.writeIntArray(g);
                break;
            case 32:
                int[] h = h();
                parcel2.writeNoException();
                parcel2.writeIntArray(h);
                break;
            case 33:
                boolean d = d();
                parcel2.writeNoException();
                bhx.a(parcel2, d);
                break;
            case 34:
                NativeApiInfo e = e();
                parcel2.writeNoException();
                bhx.b(parcel2, e);
                break;
            case 36:
                a(parcel.readString(), bhx.a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}

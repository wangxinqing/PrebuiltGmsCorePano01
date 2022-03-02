package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;

/* renamed from: nmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nmg extends bhw implements IInterface {
    public final idg a;

    public void a() {
    }

    public nmg(idg idg) {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
        iva.a((Object) idg, (Object) "Holder must not be null");
        this.a = idg;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 6001) {
            parcel.readString();
        } else if (i == 6002) {
            parcel.readString();
        } else if (i == 12011) {
            DataHolder dataHolder = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
        } else if (i == 12012) {
            parcel.readInt();
            parcel.readString();
        } else if (i == 13001) {
            DataHolder dataHolder2 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
        } else if (i == 13002) {
            parcel.readInt();
        } else if (i == 19001) {
            parcel.readInt();
            VideoCapabilities videoCapabilities = (VideoCapabilities) bhx.a(parcel, VideoCapabilities.CREATOR);
        } else if (i != 19002) {
            switch (i) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    break;
                case 5002:
                    DataHolder dataHolder3 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5003:
                    parcel.readInt();
                    parcel.readString();
                    break;
                case 5004:
                    DataHolder dataHolder4 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5005:
                    DataHolder dataHolder5 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    DataHolder dataHolder6 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5006:
                    DataHolder dataHolder7 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5007:
                    DataHolder dataHolder8 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5008:
                    DataHolder dataHolder9 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5009:
                    DataHolder dataHolder10 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5010:
                    DataHolder dataHolder11 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                case 5011:
                    DataHolder dataHolder12 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                    break;
                default:
                    switch (i) {
                        case 5016:
                            a();
                            break;
                        case 5017:
                            DataHolder dataHolder13 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5018:
                            DataHolder dataHolder14 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5019:
                            DataHolder dataHolder15 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            break;
                        case 5021:
                            DataHolder dataHolder16 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5022:
                            DataHolder dataHolder17 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5023:
                            DataHolder dataHolder18 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5024:
                            DataHolder dataHolder19 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5025:
                            DataHolder dataHolder20 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5026:
                            DataHolder dataHolder21 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5027:
                            DataHolder dataHolder22 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5028:
                            DataHolder dataHolder23 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5029:
                            DataHolder dataHolder24 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5030:
                            DataHolder dataHolder25 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5031:
                            DataHolder dataHolder26 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            parcel.createStringArray();
                            break;
                        case 5032:
                            RealTimeMessage realTimeMessage = (RealTimeMessage) bhx.a(parcel, RealTimeMessage.CREATOR);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            bhx.a(parcel);
                            break;
                        case 5035:
                            DataHolder dataHolder27 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5036:
                            parcel.readInt();
                            break;
                        case 5037:
                            DataHolder dataHolder28 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5038:
                            DataHolder dataHolder29 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5039:
                            DataHolder dataHolder30 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 5040:
                            parcel.readInt();
                            break;
                        case 9001:
                            DataHolder dataHolder31 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 11001:
                            parcel.readInt();
                            Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                            break;
                        case 12001:
                            DataHolder dataHolder32 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 14001:
                            DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                            break;
                        case 15001:
                            DataHolder dataHolder33 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 17002:
                            parcel.readInt();
                            break;
                        case 19008:
                            parcel.readInt();
                            break;
                        case 19009:
                            parcel.readInt();
                            break;
                        case 19010:
                            parcel.readInt();
                            break;
                        case 20001:
                            DataHolder dataHolder34 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20002:
                            DataHolder dataHolder35 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20003:
                            DataHolder dataHolder36 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20004:
                            DataHolder dataHolder37 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20005:
                            DataHolder dataHolder38 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20006:
                            DataHolder dataHolder39 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20007:
                            DataHolder dataHolder40 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20008:
                            DataHolder dataHolder41 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20009:
                            DataHolder dataHolder42 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                            break;
                        case 20012:
                            Status status = (Status) bhx.a(parcel, Status.CREATOR);
                            break;
                        case 20019:
                            parcel.readInt();
                            break;
                        case 20020:
                            parcel.readInt();
                            Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                            break;
                        case 23001:
                            parcel.readInt();
                            break;
                        case 23002:
                            parcel.readInt();
                            break;
                        case 23003:
                            parcel.readInt();
                            break;
                        case 23004:
                            parcel.readInt();
                            break;
                        case 23005:
                            parcel.readInt();
                            break;
                        case 24002:
                            bhx.a(parcel);
                            break;
                        default:
                            switch (i) {
                                case 8001:
                                    DataHolder dataHolder43 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    Bundle bundle3 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                                    break;
                                case 8003:
                                    DataHolder dataHolder44 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8004:
                                    DataHolder dataHolder45 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8005:
                                    DataHolder dataHolder46 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8006:
                                    DataHolder dataHolder47 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    break;
                                case 8008:
                                    DataHolder dataHolder48 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    break;
                                case 8010:
                                    parcel.readString();
                                    break;
                                default:
                                    switch (i) {
                                        case 10001:
                                            DataHolder dataHolder49 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            break;
                                        case 10003:
                                            DataHolder dataHolder50 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10004:
                                            DataHolder dataHolder51 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            Bundle bundle4 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                                            break;
                                        case 10006:
                                            DataHolder dataHolder52 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                            break;
                                        default:
                                            switch (i) {
                                                case 12004:
                                                    DataHolder dataHolder53 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                    Contents contents = (Contents) bhx.a(parcel, Contents.CREATOR);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder54 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12006:
                                                    DataHolder dataHolder55 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12007:
                                                    DataHolder dataHolder56 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                    break;
                                                case 12008:
                                                    DataHolder dataHolder57 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 12014:
                                                            DataHolder dataHolder58 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            Bundle bundle5 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                                                            break;
                                                        case 12016:
                                                            DataHolder dataHolder59 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder60 = (DataHolder) bhx.a(parcel, DataHolder.CREATOR);
                                                            parcel.readString();
                                                            Contents contents2 = (Contents) bhx.a(parcel, Contents.CREATOR);
                                                            Contents contents3 = (Contents) bhx.a(parcel, Contents.CREATOR);
                                                            Contents contents4 = (Contents) bhx.a(parcel, Contents.CREATOR);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            parcel.readInt();
            bhx.a(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}

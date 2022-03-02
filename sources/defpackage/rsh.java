package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import org.chromium.net.UrlRequest;

/* renamed from: rsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsh extends bhw implements rsi {
    public rsh() {
        super("com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final rwa a(GroundOverlayOptions groundOverlayOptions) {
        return new rvz();
    }

    public final void a(mby mby) {
    }

    public final void a(rsm rsm) {
    }

    public final void a(rsv rsv) {
    }

    public final void a(rsy rsy) {
    }

    public final void a(rtd rtd) {
    }

    public final void a(rtn rtn) {
    }

    public final void a(rtv rtv) {
    }

    public final void a(rua rua) {
    }

    public final void a(boolean z) {
    }

    public final CameraPosition b() {
        rux a = CameraPosition.a();
        a.a = new LatLng(0.0d, 0.0d);
        return a.a();
    }

    public final void b(mby mby) {
    }

    public final void c() {
    }

    public final Location d() {
        return new Location("null_provider");
    }

    public final rus e() {
        return new rur();
    }

    public final rui f() {
        return new ruh();
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final rwg a(MarkerOptions markerOptions) {
        return new rwf();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 44) {
            rwc rwc = new rwc();
            parcel2.writeNoException();
            bhx.a(parcel2, (IInterface) rwc);
            return true;
        } else if (i == 45) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
                if (queryLocalInterface instanceof rtg) {
                    rtg rtg = (rtg) queryLocalInterface;
                } else {
                    new rtg(readStrongBinder);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 51) {
            bhx.a(parcel);
            parcel2.writeNoException();
            return true;
        } else if (i == 71) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                if (queryLocalInterface2 instanceof ruj) {
                    ruj ruj = (ruj) queryLocalInterface2;
                } else {
                    new ruj(readStrongBinder2);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 89) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.maps.internal.IOnCircleClickListener");
                if (queryLocalInterface3 instanceof rte) {
                    rte rte = (rte) queryLocalInterface3;
                } else {
                    new rte(readStrongBinder3);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 107) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
                if (queryLocalInterface4 instanceof rub) {
                    rub rub = (rub) queryLocalInterface4;
                } else {
                    new rub(readStrongBinder4);
                }
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 101) {
            parcel2.writeNoException();
            return true;
        } else if (i != 102) {
            switch (i) {
                case 1:
                    CameraPosition b = b();
                    parcel2.writeNoException();
                    bhx.b(parcel2, b);
                    return true;
                case 2:
                    parcel2.writeNoException();
                    parcel2.writeFloat(1.0f);
                    return true;
                case 3:
                    parcel2.writeNoException();
                    parcel2.writeFloat(1.0f);
                    return true;
                case 4:
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface5 instanceof mby) {
                            mby mby = (mby) queryLocalInterface5;
                        } else {
                            new mbw(readStrongBinder5);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface6 instanceof mby) {
                            mby mby2 = (mby) queryLocalInterface6;
                        } else {
                            new mbw(readStrongBinder6);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IBinder readStrongBinder7 = parcel.readStrongBinder();
                    if (readStrongBinder7 != null) {
                        IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface7 instanceof mby) {
                            mby mby3 = (mby) queryLocalInterface7;
                        } else {
                            new mbw(readStrongBinder7);
                        }
                    }
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        if (queryLocalInterface8 instanceof rsc) {
                            rsc rsc = (rsc) queryLocalInterface8;
                        } else {
                            new rsc(readStrongBinder8);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if (queryLocalInterface9 instanceof mby) {
                            mby mby4 = (mby) queryLocalInterface9;
                        } else {
                            new mbw(readStrongBinder9);
                        }
                    }
                    parcel.readInt();
                    IBinder readStrongBinder10 = parcel.readStrongBinder();
                    if (readStrongBinder10 != null) {
                        IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.maps.internal.ICancelableCallback");
                        if (queryLocalInterface10 instanceof rsc) {
                            rsc rsc2 = (rsc) queryLocalInterface10;
                        } else {
                            new rsc(readStrongBinder10);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel2.writeNoException();
                    return true;
                case 9:
                    PolylineOptions polylineOptions = (PolylineOptions) bhx.a(parcel, PolylineOptions.CREATOR);
                    rwl rwl = new rwl();
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) rwl);
                    return true;
                case 10:
                    PolygonOptions polygonOptions = (PolygonOptions) bhx.a(parcel, PolygonOptions.CREATOR);
                    rwi rwi = new rwi();
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) rwi);
                    return true;
                case 11:
                    rwg a = a((MarkerOptions) bhx.a(parcel, MarkerOptions.CREATOR));
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) a);
                    return true;
                case 12:
                    rwa a2 = a((GroundOverlayOptions) bhx.a(parcel, GroundOverlayOptions.CREATOR));
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) a2);
                    return true;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    TileOverlayOptions tileOverlayOptions = (TileOverlayOptions) bhx.a(parcel, TileOverlayOptions.CREATOR);
                    rwo rwo = new rwo();
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) rwo);
                    return true;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    parcel2.writeNoException();
                    return true;
                case Service.START_CONTINUATION_MASK:
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 16:
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel2.writeNoException();
                    bhx.a(parcel2, false);
                    return true;
                case 18:
                    bhx.a(parcel);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel2.writeNoException();
                    bhx.a(parcel2, false);
                    return true;
                case 20:
                    bhx.a(parcel);
                    parcel2.writeNoException();
                    bhx.a(parcel2, false);
                    return true;
                case 21:
                    parcel2.writeNoException();
                    bhx.a(parcel2, false);
                    return true;
                case 22:
                    bhx.a(parcel);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    Location d = d();
                    parcel2.writeNoException();
                    bhx.b(parcel2, d);
                    return true;
                case 24:
                    IBinder readStrongBinder11 = parcel.readStrongBinder();
                    if (readStrongBinder11 != null) {
                        IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.maps.internal.ILocationSourceDelegate");
                        if (queryLocalInterface11 instanceof rsm) {
                            rsm rsm = (rsm) queryLocalInterface11;
                        } else {
                            new rsk(readStrongBinder11);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 25:
                    rus e = e();
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) e);
                    return true;
                case 26:
                    rui f = f();
                    parcel2.writeNoException();
                    bhx.a(parcel2, (IInterface) f);
                    return true;
                case 27:
                    IBinder readStrongBinder12 = parcel.readStrongBinder();
                    if (readStrongBinder12 != null) {
                        IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
                        if (queryLocalInterface12 instanceof rsv) {
                            rsv rsv = (rsv) queryLocalInterface12;
                        } else {
                            new rst(readStrongBinder12);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 28:
                    IBinder readStrongBinder13 = parcel.readStrongBinder();
                    if (readStrongBinder13 != null) {
                        IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
                        if (queryLocalInterface13 instanceof rtn) {
                            rtn rtn = (rtn) queryLocalInterface13;
                        } else {
                            new rtl(readStrongBinder13);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 29:
                    IBinder readStrongBinder14 = parcel.readStrongBinder();
                    if (readStrongBinder14 != null) {
                        IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
                        if (queryLocalInterface14 instanceof rtp) {
                            rtp rtp = (rtp) queryLocalInterface14;
                        } else {
                            new rtp(readStrongBinder14);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 30:
                    IBinder readStrongBinder15 = parcel.readStrongBinder();
                    if (readStrongBinder15 != null) {
                        IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
                        if (queryLocalInterface15 instanceof rtv) {
                            rtv rtv = (rtv) queryLocalInterface15;
                        } else {
                            new rtt(readStrongBinder15);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 31:
                    IBinder readStrongBinder16 = parcel.readStrongBinder();
                    if (readStrongBinder16 != null) {
                        IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
                        if (queryLocalInterface16 instanceof rtw) {
                            rtw rtw = (rtw) queryLocalInterface16;
                        } else {
                            new rtw(readStrongBinder16);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 32:
                    IBinder readStrongBinder17 = parcel.readStrongBinder();
                    if (readStrongBinder17 != null) {
                        IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
                        if (queryLocalInterface17 instanceof rth) {
                            rth rth = (rth) queryLocalInterface17;
                        } else {
                            new rth(readStrongBinder17);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                case 33:
                    IBinder readStrongBinder18 = parcel.readStrongBinder();
                    if (readStrongBinder18 != null) {
                        IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                        if (queryLocalInterface18 instanceof rsj) {
                            rsj rsj = (rsj) queryLocalInterface18;
                        } else {
                            new rsj(readStrongBinder18);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 35:
                            CircleOptions circleOptions = (CircleOptions) bhx.a(parcel, CircleOptions.CREATOR);
                            rvw rvw = new rvw();
                            parcel2.writeNoException();
                            bhx.a(parcel2, (IInterface) rvw);
                            return true;
                        case 36:
                            IBinder readStrongBinder19 = parcel.readStrongBinder();
                            if (readStrongBinder19 != null) {
                                IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
                                if (queryLocalInterface19 instanceof rua) {
                                    rua rua = (rua) queryLocalInterface19;
                                } else {
                                    new rty(readStrongBinder19);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case 37:
                            IBinder readStrongBinder20 = parcel.readStrongBinder();
                            if (readStrongBinder20 != null) {
                                IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
                                if (queryLocalInterface20 instanceof rtx) {
                                    rtx rtx = (rtx) queryLocalInterface20;
                                } else {
                                    new rtx(readStrongBinder20);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case 38:
                            IBinder readStrongBinder21 = parcel.readStrongBinder();
                            if (readStrongBinder21 != null) {
                                IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
                                if (queryLocalInterface21 instanceof ruj) {
                                    ruj ruj2 = (ruj) queryLocalInterface21;
                                } else {
                                    new ruj(readStrongBinder21);
                                }
                            }
                            IBinder readStrongBinder22 = parcel.readStrongBinder();
                            if (readStrongBinder22 != null) {
                                IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                if (queryLocalInterface22 instanceof mby) {
                                    mby mby5 = (mby) queryLocalInterface22;
                                } else {
                                    new mbw(readStrongBinder22);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        case 39:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            parcel2.writeNoException();
                            return true;
                        case 40:
                            parcel2.writeNoException();
                            bhx.a(parcel2, false);
                            return true;
                        case 41:
                            bhx.a(parcel);
                            parcel2.writeNoException();
                            return true;
                        case 42:
                            IBinder readStrongBinder23 = parcel.readStrongBinder();
                            if (readStrongBinder23 != null) {
                                IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
                                if (queryLocalInterface23 instanceof rto) {
                                    rto rto = (rto) queryLocalInterface23;
                                } else {
                                    new rto(readStrongBinder23);
                                }
                            }
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 53:
                                    IBinder readStrongBinder24 = parcel.readStrongBinder();
                                    if (readStrongBinder24 != null) {
                                        IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapReadyCallback");
                                        if (queryLocalInterface24 instanceof rts) {
                                            rts rts = (rts) queryLocalInterface24;
                                        } else {
                                            new rtq(readStrongBinder24);
                                        }
                                    }
                                    parcel2.writeNoException();
                                    return true;
                                case 54:
                                    Bundle bundle = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                                    parcel2.writeNoException();
                                    return true;
                                case 55:
                                    parcel2.writeNoException();
                                    return true;
                                case 56:
                                    parcel2.writeNoException();
                                    return true;
                                case 57:
                                    parcel2.writeNoException();
                                    return true;
                                case 58:
                                    parcel2.writeNoException();
                                    return true;
                                case 59:
                                    parcel2.writeNoException();
                                    bhx.a(parcel2, false);
                                    return true;
                                case 60:
                                    parcel2.writeNoException();
                                    bhx.b(parcel2, (Bundle) bhx.a(parcel, Bundle.CREATOR));
                                    return true;
                                case 61:
                                    parcel.readString();
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i) {
                                        case 80:
                                            IBinder readStrongBinder25 = parcel.readStrongBinder();
                                            if (readStrongBinder25 != null) {
                                                IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
                                                if (queryLocalInterface25 instanceof ruc) {
                                                    ruc ruc = (ruc) queryLocalInterface25;
                                                } else {
                                                    new ruc(readStrongBinder25);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 81:
                                            Bundle bundle2 = (Bundle) bhx.a(parcel, Bundle.CREATOR);
                                            parcel2.writeNoException();
                                            return true;
                                        case 82:
                                            parcel2.writeNoException();
                                            return true;
                                        case 83:
                                            IBinder readStrongBinder26 = parcel.readStrongBinder();
                                            if (readStrongBinder26 != null) {
                                                IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
                                                if (queryLocalInterface26 instanceof rtf) {
                                                    rtf rtf = (rtf) queryLocalInterface26;
                                                } else {
                                                    new rtf(readStrongBinder26);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 84:
                                            IBinder readStrongBinder27 = parcel.readStrongBinder();
                                            if (readStrongBinder27 != null) {
                                                IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
                                                if (queryLocalInterface27 instanceof rtj) {
                                                    rtj rtj = (rtj) queryLocalInterface27;
                                                } else {
                                                    new rtj(readStrongBinder27);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 85:
                                            IBinder readStrongBinder28 = parcel.readStrongBinder();
                                            if (readStrongBinder28 != null) {
                                                IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolygonClickListener");
                                                if (queryLocalInterface28 instanceof rud) {
                                                    rud rud = (rud) queryLocalInterface28;
                                                } else {
                                                    new rud(readStrongBinder28);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 86:
                                            IBinder readStrongBinder29 = parcel.readStrongBinder();
                                            if (readStrongBinder29 != null) {
                                                IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
                                                if (queryLocalInterface29 instanceof rti) {
                                                    rti rti = (rti) queryLocalInterface29;
                                                } else {
                                                    new rti(readStrongBinder29);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        case 87:
                                            IBinder readStrongBinder30 = parcel.readStrongBinder();
                                            if (readStrongBinder30 != null) {
                                                IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
                                                if (queryLocalInterface30 instanceof rue) {
                                                    rue rue = (rue) queryLocalInterface30;
                                                } else {
                                                    new rue(readStrongBinder30);
                                                }
                                            }
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 91:
                                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) bhx.a(parcel, MapStyleOptions.CREATOR);
                                                    parcel2.writeNoException();
                                                    bhx.a(parcel2, false);
                                                    return true;
                                                case 92:
                                                    parcel.readFloat();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 93:
                                                    parcel.readFloat();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 94:
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 95:
                                                    LatLngBounds latLngBounds = (LatLngBounds) bhx.a(parcel, LatLngBounds.CREATOR);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 96:
                                                    IBinder readStrongBinder31 = parcel.readStrongBinder();
                                                    if (readStrongBinder31 != null) {
                                                        IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
                                                        if (queryLocalInterface31 instanceof rtd) {
                                                            rtd rtd = (rtd) queryLocalInterface31;
                                                        } else {
                                                            new rtb(readStrongBinder31);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 97:
                                                    IBinder readStrongBinder32 = parcel.readStrongBinder();
                                                    if (readStrongBinder32 != null) {
                                                        IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
                                                        if (queryLocalInterface32 instanceof rta) {
                                                            rta rta = (rta) queryLocalInterface32;
                                                        } else {
                                                            new rta(readStrongBinder32);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 98:
                                                    IBinder readStrongBinder33 = parcel.readStrongBinder();
                                                    if (readStrongBinder33 != null) {
                                                        IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
                                                        if (queryLocalInterface33 instanceof rsz) {
                                                            rsz rsz = (rsz) queryLocalInterface33;
                                                        } else {
                                                            new rsz(readStrongBinder33);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 99:
                                                    IBinder readStrongBinder34 = parcel.readStrongBinder();
                                                    if (readStrongBinder34 != null) {
                                                        IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
                                                        if (queryLocalInterface34 instanceof rsy) {
                                                            rsy rsy = (rsy) queryLocalInterface34;
                                                        } else {
                                                            new rsw(readStrongBinder34);
                                                        }
                                                    }
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                    }
            }
        } else {
            parcel2.writeNoException();
            return true;
        }
    }
}

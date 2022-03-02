package defpackage;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.ui.autocomplete.AutocompleteChimeraActivity;
import com.google.android.places.ui.autocomplete.SessionLogger;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* renamed from: rlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlr implements ListAdapter, Filterable, AdapterView.OnItemClickListener {
    public final rlq a = new rlq(this);
    public rlk b;
    public final icc c;
    icf d;
    public LatLngBounds e;
    public AutocompleteFilter f;
    public alcj g;
    public alch h;
    public final rjl i;
    private final Set j = new HashSet();

    public rlr(icc icc) {
        rjl rjl = rij.e;
        this.c = icc;
        this.i = rjl;
        this.b = rlk.f;
    }

    /* renamed from: a */
    public final rhf getItem(int i2) {
        rlk rlk = this.b;
        int i3 = rlk.a;
        if ((i3 == 3 || i3 == 5) && i2 < rlk.c.size()) {
            return (rhf) this.b.c.get(i2);
        }
        return null;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        rlk rlk = this.b;
        int i2 = rlk.a;
        if (i2 == 3) {
            return rlk.c.size() + 1;
        }
        if (i2 != 5) {
            return 1;
        }
        return rlk.c.size() + 1;
    }

    public final Filter getFilter() {
        return this.a;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final int getItemViewType(int i2) {
        rlk rlk = this.b;
        int i3 = rlk.a;
        if ((i3 == 3 || i3 == 5) && i2 < rlk.c.size()) {
            return 1;
        }
        return 0;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i2);
        LayoutInflater from = LayoutInflater.from(((iey) this.c).d);
        if (itemViewType != 0) {
            if (view == null) {
                view = from.inflate(R.layout.place_autocomplete_item_prediction, viewGroup, false);
            }
            a(view, i2);
        } else {
            if (view == null) {
                view = from.inflate(R.layout.place_autocomplete_item_powered_by_google, viewGroup, false);
            }
            a(view);
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i2) {
        return getItemViewType(i2) == 1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        if (!this.b.a()) {
            a((icf) null);
            if (this.c.i()) {
                rhf a2 = getItem(i2);
                a(rlk.a(this.b, i2));
                icf a3 = rjl.a(this.c, a2.d());
                a(a3);
                a3.a((icm) new rlm(this, i2, a2));
                return;
            }
            a(rlk.g);
        }
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.j.add(dataSetObserver);
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.j.remove(dataSetObserver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r7) {
        /*
            r6 = this;
            rlk r0 = r6.b
            int r1 = r0.a
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = 3
            if (r1 != r5) goto L_0x0015
            java.util.List r0 = r0.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 1
            goto L_0x0031
        L_0x0015:
            rlk r0 = r6.b
            int r1 = r0.a
            r5 = 5
            if (r1 != r5) goto L_0x0024
            java.util.List r0 = r0.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0013
        L_0x0024:
            rlk r0 = r6.b
            int r0 = r0.a
            if (r0 == r2) goto L_0x0013
            r1 = 7
            if (r0 == r1) goto L_0x0013
            r1 = 6
            if (r0 == r1) goto L_0x0013
            r0 = 0
        L_0x0031:
            int r1 = r6.getCount()
            r5 = 2131429169(0x7f0b0731, float:1.8480003E38)
            android.view.View r5 = r7.findViewById(r5)
            if (r0 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r5.setVisibility(r2)
            r0 = 2131429172(0x7f0b0734, float:1.848001E38)
            android.view.View r7 = r7.findViewById(r0)
            if (r1 <= r4) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r3 = 8
        L_0x004f:
            r7.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlr.a(android.view.View):void");
    }

    public final void a(View view, int i2) {
        rhf a2 = getItem(i2);
        TextView textView = (TextView) view.findViewById(R.id.place_autocomplete_prediction_secondary_text);
        CharSequence a3 = a2.a(new ForegroundColorSpan(view.getContext().getResources().getColor(R.color.place_autocomplete_prediction_primary_text_highlight)));
        CharSequence f2 = a2.f();
        ((TextView) view.findViewById(R.id.place_autocomplete_prediction_primary_text)).setText(a3);
        textView.setText(f2);
        View findViewById = view.findViewById(R.id.place_autocomplete_separator);
        if (TextUtils.isEmpty(f2)) {
            textView.setVisibility(8);
            findViewById.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        findViewById.setVisibility(0);
    }

    public final synchronized void a(icf icf) {
        icf icf2 = this.d;
        if (icf2 != null) {
            icf2.b();
        }
        this.d = icf;
    }

    public final void a(rlk rlk) {
        rhf rhf;
        int i2;
        String str;
        this.b = rlk;
        int i3 = rlk.a;
        if (i3 == 4 || i3 == 7) {
            if (Log.isLoggable("Places", 6)) {
                Status status = rlk.b;
                if (status != null) {
                    str = ris.g(status.i);
                } else {
                    str = "Unknown";
                }
                String valueOf = String.valueOf(str);
                Log.e("Places", valueOf.length() == 0 ? new String("Error while autocompleting: ") : "Error while autocompleting: ".concat(valueOf));
            }
            Status status2 = rlk.b;
            if (!(status2 == null || (i2 = status2.i) == 0 || i2 == 7 || i2 == 8 || i2 == 9005 || i2 == 9006)) {
                switch (i2) {
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                    case Service.START_CONTINUATION_MASK:
                        break;
                    default:
                        alcj alcj = this.g;
                        if (alcj != null) {
                            alcj.a.a(2, (rhq) null, status2);
                            break;
                        }
                        break;
                }
            }
        }
        for (DataSetObserver dataSetObserver : this.j) {
            if (this.b.c.size() > 0) {
                dataSetObserver.onChanged();
            } else {
                dataSetObserver.onInvalidated();
            }
        }
        alch alch = this.h;
        if (alch != null) {
            rlk rlk2 = this.b;
            int i4 = rlk2.a;
            if (i4 != 3) {
                if (i4 == 4) {
                    AutocompleteChimeraActivity autocompleteChimeraActivity = alch.a;
                    autocompleteChimeraActivity.d.i++;
                    autocompleteChimeraActivity.a(autocompleteChimeraActivity.getString(R.string.place_picker_search_error), true);
                } else if (i4 != 5) {
                    if (i4 == 6) {
                        AutocompleteChimeraActivity autocompleteChimeraActivity2 = alch.a;
                        SessionLogger sessionLogger = autocompleteChimeraActivity2.d;
                        int i5 = rlk2.d;
                        sessionLogger.d = true;
                        sessionLogger.g = i5;
                        alan.a((Context) autocompleteChimeraActivity2, (View) autocompleteChimeraActivity2.f);
                        rlk rlk3 = alch.a.e.a.b;
                        if (rlk3.a()) {
                            rhf = (rhf) rlk3.c.get(rlk3.d);
                        } else {
                            rhf = null;
                        }
                        AutocompleteChimeraActivity autocompleteChimeraActivity3 = alch.a;
                        autocompleteChimeraActivity3.l = true;
                        autocompleteChimeraActivity3.f.setText(rhf.a((CharacterStyle) null));
                        EditText editText = alch.a.f;
                        editText.setSelection(editText.getText().length());
                    } else if (i4 == 7) {
                        AutocompleteChimeraActivity autocompleteChimeraActivity4 = alch.a;
                        autocompleteChimeraActivity4.d.j++;
                        autocompleteChimeraActivity4.a(autocompleteChimeraActivity4.getString(R.string.place_picker_search_error), true);
                    } else if (Log.isLoggable("Places", 6)) {
                        Log.e("Places", "Unknown PlaceAutocompleteAdapter state change.");
                    }
                } else if (rlk2.c.isEmpty()) {
                    alch.a.a(alch.a.getString(R.string.place_autocomplete_noresults_for_query, new Object[]{alch.a.f.getText().toString()}), false);
                } else {
                    alch.a.h();
                }
            } else if (alch.a.k.getVisibility() == 0) {
                alch.a.i.setVisibility(0);
                alch.a.k.setVisibility(8);
            } else {
                alch.a.h();
            }
        }
    }
}

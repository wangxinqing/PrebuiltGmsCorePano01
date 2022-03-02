package com.google.android.chimera;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Fragment {
    private gj CF = null;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks {
        Activity getModuleActivity();

        Fragment getModuleFragment();

        void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        boolean superGetAllowEnterTransitionOverlap();

        boolean superGetAllowReturnTransitionOverlap();

        Bundle superGetArguments();

        Object superGetEnterTransition();

        Object superGetExitTransition();

        LayoutInflater superGetLayoutInflater(Bundle bundle);

        Object superGetReenterTransition();

        Object superGetReturnTransition();

        Object superGetSharedElementEnterTransition();

        Object superGetSharedElementReturnTransition();

        boolean superGetUserVisibleHint();

        View superGetView();

        void superOnActivityCreated(Bundle bundle);

        void superOnActivityResult(int i, int i2, Intent intent);

        void superOnAttach(Activity activity);

        void superOnConfigurationChanged(Configuration configuration);

        boolean superOnContextItemSelected(MenuItem menuItem);

        void superOnCreate(Bundle bundle);

        Animation superOnCreateAnimation(int i, boolean z, int i2);

        void superOnCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo);

        void superOnCreateOptionsMenu(Menu menu, MenuInflater menuInflater);

        View superOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

        void superOnDestroy();

        void superOnDestroyOptionsMenu();

        void superOnDestroyView();

        void superOnDetach();

        void superOnHiddenChanged(boolean z);

        void superOnInflate(Activity activity, AttributeSet attributeSet, Bundle bundle);

        void superOnLowMemory();

        boolean superOnOptionsItemSelected(MenuItem menuItem);

        void superOnOptionsMenuClosed(Menu menu);

        void superOnPause();

        void superOnPrepareOptionsMenu(Menu menu);

        void superOnResume();

        void superOnSaveInstanceState(Bundle bundle);

        void superOnStart();

        void superOnStop();

        void superOnViewCreated(View view, Bundle bundle);

        void superOnViewStateRestored(Bundle bundle);

        void superRegisterForContextMenu(View view);

        void superSetAllowEnterTransitionOverlap(boolean z);

        void superSetAllowReturnTransitionOverlap(boolean z);

        void superSetArguments(Bundle bundle);

        void superSetEnterTransition(Object obj);

        void superSetExitTransition(Object obj);

        void superSetHasOptionsMenu(boolean z);

        void superSetInitialSavedState(Fragment$SavedState fragment$SavedState);

        void superSetMenuVisibility(boolean z);

        void superSetReenterTransition(Object obj);

        void superSetRetainInstance(boolean z);

        void superSetReturnTransition(Object obj);

        void superSetSharedElementEnterTransition(Object obj);

        void superSetSharedElementReturnTransition(Object obj);

        void superSetUserVisibleHint(boolean z);

        void superStartActivity(Intent intent);

        void superStartActivityForResult(Intent intent, int i);

        void superStartIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

        String superToString();

        void superUnregisterForContextMenu(View view);
    }

    private final ProxyCallbacks aA() {
        return (ProxyCallbacks) getProxy();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aA().superDump(str, fileDescriptor, printWriter, strArr);
    }

    public Activity getActivity() {
        return aA().getModuleActivity();
    }

    public boolean getAllowEnterTransitionOverlap() {
        return aA().superGetAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return aA().superGetAllowReturnTransitionOverlap();
    }

    public final Bundle getArguments() {
        return aA().superGetArguments();
    }

    public final FragmentManager getChildFragmentManager() {
        return FragmentManager.get(getProxy().getChildFragmentManager());
    }

    public Object getContainerFragment() {
        return getProxy();
    }

    public Context getContext() {
        return getActivity();
    }

    public Object getEnterTransition() {
        return aA().superGetEnterTransition();
    }

    public Object getExitTransition() {
        return aA().superGetExitTransition();
    }

    public final FragmentManager getFragmentManager() {
        return FragmentManager.get(getProxy().getFragmentManager());
    }

    public final int getId() {
        return getProxy().getId();
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        return aA().superGetLayoutInflater(bundle);
    }

    public LoaderManager getLoaderManager() {
        return LoaderManager.get(getProxy().getLoaderManager());
    }

    public final Fragment getParentFragment() {
        ProxyCallbacks proxyCallbacks = (ProxyCallbacks) getProxy().getParentFragment();
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public gj getProxy() {
        if (this.CF == null) {
            setImpl(new FragmentProxy(this));
        }
        return this.CF;
    }

    public Object getReenterTransition() {
        return aA().superGetReenterTransition();
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        amrl.a((Object) activity);
        return activity.getResources();
    }

    public final boolean getRetainInstance() {
        return getProxy().getRetainInstance();
    }

    public Object getReturnTransition() {
        return aA().superGetReturnTransition();
    }

    public Object getSharedElementEnterTransition() {
        return aA().superGetSharedElementEnterTransition();
    }

    public Object getSharedElementReturnTransition() {
        return aA().superGetSharedElementReturnTransition();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public gj getSupportContainerFragment() {
        return getProxy();
    }

    public final String getTag() {
        return getProxy().getTag();
    }

    public Fragment getTargetFragment() {
        ProxyCallbacks proxyCallbacks = (ProxyCallbacks) getProxy().getTargetFragment();
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public final int getTargetRequestCode() {
        return getProxy().getTargetRequestCode();
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public boolean getUserVisibleHint() {
        return aA().superGetUserVisibleHint();
    }

    public View getView() {
        return aA().superGetView();
    }

    public final boolean hasOptionsMenu() {
        return getProxy().hasOptionsMenu();
    }

    public final boolean isAdded() {
        return getProxy().isAdded();
    }

    public final boolean isDetached() {
        return getProxy().isDetached();
    }

    public final boolean isHidden() {
        return getProxy().isHidden();
    }

    public final boolean isInLayout() {
        return getProxy().isInLayout();
    }

    public final boolean isMenuVisible() {
        return getProxy().isMenuVisible();
    }

    public final boolean isRemoving() {
        return getProxy().isRemoving();
    }

    public final boolean isResumed() {
        return getProxy().isResumed();
    }

    public final boolean isVisible() {
        return getProxy().isVisible();
    }

    public void onActivityCreated(Bundle bundle) {
        aA().superOnActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        aA().superOnActivityResult(i, i2, intent);
    }

    public void onAttach(Activity activity) {
        aA().superOnAttach(activity);
    }

    public void onConfigurationChanged(Configuration configuration) {
        aA().superOnConfigurationChanged(configuration);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return aA().superOnContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        aA().superOnCreate(bundle);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return aA().superOnCreateAnimation(i, z, i2);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        aA().superOnCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        aA().superOnCreateOptionsMenu(menu, menuInflater);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return aA().superOnCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        aA().superOnDestroy();
    }

    public void onDestroyOptionsMenu() {
        aA().superOnDestroyOptionsMenu();
    }

    public void onDestroyView() {
        aA().superOnDestroyView();
    }

    public void onDetach() {
        aA().superOnDetach();
    }

    public void onHiddenChanged(boolean z) {
        aA().superOnHiddenChanged(z);
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        aA().superOnInflate(activity, attributeSet, bundle);
    }

    public void onLowMemory() {
        aA().superOnLowMemory();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return aA().superOnOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        aA().superOnOptionsMenuClosed(menu);
    }

    public void onPause() {
        aA().superOnPause();
    }

    public void onPrepareOptionsMenu(Menu menu) {
        aA().superOnPrepareOptionsMenu(menu);
    }

    public void onResume() {
        aA().superOnResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        aA().superOnSaveInstanceState(bundle);
    }

    public void onStart() {
        aA().superOnStart();
    }

    public void onStop() {
        aA().superOnStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        aA().superOnViewCreated(view, bundle);
    }

    public void onViewStateRestored(Bundle bundle) {
        aA().superOnViewStateRestored(bundle);
    }

    public void registerForContextMenu(View view) {
        aA().superRegisterForContextMenu(view);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        aA().superSetAllowEnterTransitionOverlap(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        aA().superSetAllowReturnTransitionOverlap(z);
    }

    public void setArguments(Bundle bundle) {
        aA().superSetArguments(bundle);
    }

    public void setEnterTransition(Object obj) {
        aA().superSetEnterTransition(obj);
    }

    public void setExitTransition(Object obj) {
        aA().superSetExitTransition(obj);
    }

    public void setHasOptionsMenu(boolean z) {
        aA().superSetHasOptionsMenu(z);
    }

    /* access modifiers changed from: protected */
    public final void setImpl(gj gjVar) {
        amrl.b(this.CF == null);
        this.CF = gjVar;
    }

    public void setInitialSavedState(SavedState savedState) {
        aA().superSetInitialSavedState(savedState != null ? savedState.a : null);
    }

    public void setMenuVisibility(boolean z) {
        aA().superSetMenuVisibility(z);
    }

    public void setReenterTransition(Object obj) {
        aA().superSetReenterTransition(obj);
    }

    public void setRetainInstance(boolean z) {
        aA().superSetRetainInstance(z);
    }

    public void setReturnTransition(Object obj) {
        aA().superSetReturnTransition(obj);
    }

    public void setSharedElementEnterTransition(Object obj) {
        aA().superSetSharedElementEnterTransition(obj);
    }

    public void setSharedElementReturnTransition(Object obj) {
        aA().superSetSharedElementReturnTransition(obj);
    }

    public void setTargetFragment(Fragment fragment, int i) {
        getProxy().setTargetFragment(fragment.getSupportContainerFragment(), i);
    }

    public void setUserVisibleHint(boolean z) {
        aA().superSetUserVisibleHint(z);
    }

    public void startActivity(Intent intent) {
        aA().superStartActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        aA().superStartActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        aA().superStartIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public String toString() {
        return aA().superToString();
    }

    public void unregisterForContextMenu(View view) {
        aA().superUnregisterForContextMenu(view);
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new bjf();
        public final Fragment$SavedState a;

        public SavedState(Parcel parcel) {
            this.a = (Fragment$SavedState) parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
        }

        public SavedState(Fragment$SavedState fragment$SavedState) {
            this.a = fragment$SavedState;
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }
}

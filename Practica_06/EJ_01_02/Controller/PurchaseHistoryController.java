package Ejercicio.ShoppingCart.Controller;

import Ejercicio.ShoppingCart.Model.PurchaseHistory;
import Ejercicio.ShoppingCart.View.HistoryPurchasesView;

public class PurchaseHistoryController {
    protected PurchaseHistory purchaseHistory;
    protected HistoryPurchasesView historyPurchasesView;

    public PurchaseHistoryController(PurchaseHistory purchaseHistory, HistoryPurchasesView historyPurchasesView) {
        this.purchaseHistory = purchaseHistory;
        this.historyPurchasesView = historyPurchasesView;
    }

    public void showPurchaseHistory() {
        historyPurchasesView.showHistoryPurchasesView(purchaseHistory.getPurchase());
    }
}
package it.thundyy.multieconomy.currency.provider;

import it.thundyy.multieconomy.currency.Currency;
import it.thundyy.multieconomy.currency.registry.CurrencyRegistry;
import lombok.Getter;
import org.bukkit.configuration.ConfigurationSection;

import java.util.List;

public class CurrencyProvider {
    private final CurrencyRegistry registry = CurrencyRegistry.getInstance();

    public void register(ConfigurationSection section) {
        // TODO: 15/01/2023  
    }
    
    public void register(Currency currency) {
        if (currency == null) throw new NullPointerException("Currency cannot be null");
        registry.registerCurrency(currency);

        System.out.println("Logged currency " + currency.name());
    }
}

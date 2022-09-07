package ru.practicum.item;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private Map<Long, Item> items = new HashMap();

    @Override
    public List<Item> findByUserId(long userId) {
        List<Item> userItems = new ArrayList<>();
        for (Long id: items.keySet()) {
            if (id.equals(userId)) {
                userItems.add(items.get(id));
            }
        }
        return userItems;
    }

    @Override
    public Item save(Item item) {
        if (item != null) {
            items.add(item);
            return item;
        } else {
            throw new RuntimeException("item = null");
        }
    }

    @Override
    public void deleteByUserIdAndItemId(long userId, long itemId) {

    }
}

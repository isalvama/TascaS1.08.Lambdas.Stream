package second_level;

import java.util.List;

@FunctionalInterface
interface Filter {
List<String> getFilteredList(List<Object> elementList);
}

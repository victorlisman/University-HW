#include <iostream>
#include <queue>
using namespace std;

struct Order {
    int arrival_time;
    int duration;
};

int main() {
    int N, T;
    cin >> N >> T;

    // Create a priority queue to store the orders
    priority_queue<pair<int, Order>, vector<pair<int, Order>>, greater<pair<int, Order>>> orders;

    // Read in the orders
    for (int i = 0; i < N; i++) {
        int t, d;
        cin >> t >> d;
        orders.push(make_pair(t, Order{t, d}));
    }

    // Initialize variables for tracking the state of the queue
    int prev_time = 0;
    int max_duration = 0;
    bool is_empty = true;

    // Process the orders
    while (!orders.empty() && prev_time <= T) {
        int time = orders.top().first;
        Order order = orders.top().second;
        orders.pop();

        // Update the maximum duration
        max_duration = max(max_duration, order.duration);

        // Calculate the expected and true completion times
        int expected_completion_time = order.arrival_time + order.duration;
        int true_completion_time = max(expected_completion_time, time);

        // Print the completion times
        cout << "Order " << order.arrival_time << ": expected completion time = " << expected_completion_time << ", true time = " << true_completion_time << endl;

        // Update the state of the queue
        if (prev_time < time) {
            cout << "Between moments " << prev_time << " and " << time << ", the queue is empty" << endl;
            is_empty = true;
        }
        is_empty = false;
        prev_time = time + order.duration;
    }

    // Check if any orders were completed after the restaurant's closing time
    if (prev_time > T) {
        cout << "There were orders completed after the restaurant's closing time" << endl;
    }

    // Print the maximum duration of the orders
    cout << "The maximum duration of received orders is " << max_duration << endl;

    return 0;
}